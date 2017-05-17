import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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
		instructionsButton.relocate(125, 436);
		settingsButton.relocate(125, 472);
		creditsButton.relocate(125, 508);
        layout.getChildren().add(playButton);
        layout.getChildren().add(instructionsButton);
        layout.getChildren().add(settingsButton);
        layout.getChildren().add(creditsButton);
        Scene game = new Scene(layout, 1280, 720);

        stage.setScene(game);
		game.getStylesheets().add("Poison.css");
        stage.show();
    }
}