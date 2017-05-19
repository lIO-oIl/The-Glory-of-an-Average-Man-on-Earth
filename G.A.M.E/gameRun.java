//JavaFX Core
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//effects
import javafx.animation.FillTransition;
import javafx.util.Duration;
import javafx.scene.shape.Shape;
import javafx.scene.control.Label;
import java.awt.GraphicsEnvironment;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.transform.Translate;
import javafx.scene.paint.Color;
//Sound
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class gameRun extends Application {

    Stage stage;
    Button playButton, instructionsButton, settingsButton, creditsButton, exitButton;
	MediaPlayer bgm, buttonPlay;
	settingsRun settings = new settingsRun();
	game game = new game();
	Scene menu;
	String username;
	

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        stage.setTitle("The Glory of an Average Man on Earth");
		Label trademark = new Label ("G.A.M.E.");
        playButton = new Button("Play");
        instructionsButton = new Button("Instructions");
        settingsButton = new Button("Settings");
        creditsButton = new Button("Credits");
        exitButton = new Button("Exit");

        Pane layout = new Pane();
		trademark.relocate(1230, 0);
		trademark.getStyleClass().add("TM");
		
		playButton.relocate(95, 400);
		instructionsButton.relocate(95, 436);
		settingsButton.relocate(95, 472);
		creditsButton.relocate(95, 508);
		exitButton.relocate(95, 544);
		
		//Button Triggers
		playButton.setOnAction(e -> game.runScene(stage, this));
		instructionsButton.setOnAction(e -> System.out.println("Instructions"));
		settingsButton.setOnAction(e -> settings.runScene(stage, this));
		creditsButton.setOnAction(e -> System.out.println("Credits"));
		exitButton.setOnAction(e -> stage.close());
		
		Button[] allButtons = {playButton, instructionsButton, settingsButton, creditsButton, exitButton};
		Media bh = new Media(new File("buttonHover.aiff").toURI().toString());
		buttonPlay = new MediaPlayer(bh);
		for(Button button : allButtons)
		{
			button.setOnMouseEntered(e -> buttonPlay.play());
			button.setOnMouseExited(e -> buttonPlay.stop());
		}
		
		Media bg = new Media(new File("Background.mp3").toURI().toString());
		bgm = new MediaPlayer(bg);
		bgm.setOnEndOfMedia(new Runnable() {
			public void run() {
				bgm.seek(Duration.ZERO);
			}
		});
		bgm.setVolume(0.3);
		bgm.play();
		
		stage.getIcons().add(new Image("file:gameIcon.png"));
		
        menu = new Scene(layout, 1280, 720);
        layout.getChildren().addAll(trademark, playButton, instructionsButton, settingsButton, creditsButton, exitButton);
        stage.setScene(menu);
		menu.getStylesheets().add("gameRun.css");
        stage.show();
    }
	
	public void newSettings(Double bgmVol, Double sfxVol, String name) {
		bgm.setVolume(0.3 * (bgmVol / 100));
		buttonPlay.setVolume(0.5 * sfxVol / 100);
		username = name;
	}
	
	public void returnToMenu(Stage stage) {
		stage.setScene(menu);
        stage.show();
	}
}