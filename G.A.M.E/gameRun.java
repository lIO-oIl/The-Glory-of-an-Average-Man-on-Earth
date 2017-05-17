import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.animation.FillTransition;
import javafx.util.Duration;
import javafx.scene.shape.Shape;

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
        playButton = new Button("Play");
        instructionsButton = new Button("Instructions");
        settingsButton = new Button("Settings");
        creditsButton = new Button("Credits");

        Pane layout = new Pane();
		playButton.relocate(125, 400);
		playButton.setPrefHeight(36);
		playButton.setPrefWidth(400);
		instructionsButton.relocate(125, 436);
		playButton.setPrefHeight(36);
		instructionsButton.setPrefWidth(400);
		settingsButton.relocate(125, 472);
		playButton.setPrefHeight(36);
		settingsButton.setPrefWidth(400);
		creditsButton.relocate(125, 508);
		playButton.setPrefHeight(36);
		creditsButton.setPrefWidth(400);
        layout.getChildren().addAll(playButton, instructionsButton, settingsButton, creditsButton);
		
		FillTransition toOrange = new FillTransition(Duration.seconds(0.4), playButton);
        toOrange.setToValue(Color.ORANGE);
		
        Scene game = new Scene(layout, 1280, 720);

        stage.setScene(game);
		game.getStylesheets().add("Poison.css");
        stage.show();
    }
}