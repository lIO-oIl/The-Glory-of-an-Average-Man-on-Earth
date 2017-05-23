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
import javafx.scene.control.Slider;
import java.awt.GraphicsEnvironment;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.transform.Translate;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.control.TextField;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
//Sound
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.scene.media.MediaPlayer.Status;

public class game
{
	Scene game;
	Media bg = new Media(new File("YourHometown.mp3").toURI().toString());
	MediaPlayer bgm;
	Timeline timeline;
	String username;
	settingsRun settings;
	Location currentLocation;
	
	public void runScene(Stage stage, gameRun menu, worldMap map, settingsRun s) {
		settings = s;
		Pane layout = new Pane();
		Button mapButton = new Button("Map");
		Button settingsButton = new Button("Settings");
		Button menuButton = new Button("Main Menu");
		mapButton.setOnAction(e ->{map.runScene(stage, this);});
		menuButton.setOnAction(e ->{
			menu.runScene(stage);
			bgm.stop();
		});
		
		menuButton.relocate(0, 30);
		
		settingsButton.setOnAction(e -> settings.runScene(stage, menu, game));
		settingsButton.relocate(0, 60);
		
		game = new Scene(layout, 1280, 720);
        layout.getChildren().addAll(mapButton, settingsButton, menuButton);
		game.getStylesheets().add("game.css");
		stage.setScene(game);
        stage.show();
		bgm = new MediaPlayer(bg);
		bgm.setCycleCount(bgm.INDEFINITE);
		
		try {
			if(currentLocation.getType().equals("Town"))
			{
				loadTown(currentLocation);
			}
			else
			{
				loadZone(currentLocation);
			}
		} 
		catch(Exception IOException) {}
	}
	
	public void updateLocation (Location newLocation){
		if(bgm.getStatus().equals(Status.PLAYING))
		{
			timeline = new Timeline(new KeyFrame(Duration.seconds(2), new KeyValue(bgm.volumeProperty(), 0)));
			timeline.play();
			bgm.stop();
		}
		
		bg = new Media(new File(newLocation.getMusic()).toURI().toString());
		bgm = new MediaPlayer(bg);
		bgm.play();
		
		timeline = new Timeline(new KeyFrame(Duration.seconds(2), new KeyValue(bgm.volumeProperty(), 1)));
		timeline.play();
		bgm.setCycleCount(bgm.INDEFINITE);
		
		currentLocation = newLocation;
	}
	
	public void returnToGame(Stage stage) {
		stage.setScene(game);
        stage.show();
	}
	
	public void newSettings(Double bgmVol, Double sfxVol, String name) {
		bgm.setVolume(0.3 * (settings.getBGMVolume()));
		//buttonPlay.setVolume(0.5 * sfxVol / 100);
		username = name;
	}
	
	public void loadTown(Location current) {
		System.out.println(current);
	}
	
	public void loadZone(Location current) {
		System.out.println(current);
	}
}