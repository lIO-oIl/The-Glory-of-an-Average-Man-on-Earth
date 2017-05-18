import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
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

public class gameRun extends Application {

    Stage stage;
    Button playButton, instructionsButton, settingsButton, creditsButton;

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

        Pane layout = new Pane();
		trademark.relocate(1230, 0);
		trademark.getStyleClass().add("TM");
		
		playButton.relocate(95, 400);
		instructionsButton.relocate(95, 436);
		settingsButton.relocate(95, 472);
		creditsButton.relocate(95, 508);
		
        layout.getChildren().addAll(trademark, playButton, instructionsButton, settingsButton, creditsButton);
		
		playButton.setOnAction(e -> System.out.println("Play"));
		instructionsButton.setOnAction(e -> System.out.println("Instructions"));
		settingsButton.setOnAction(e -> System.out.println("Settings"));
		creditsButton.setOnAction(e -> System.out.println("Credits"));
		
		stage.getIcons().add(new Image("file:gameIcon.png"));
		
        Scene game = new Scene(layout, 1280, 720);

        stage.setScene(game);
		game.getStylesheets().add("Poison.css");
        stage.show();
    }
}