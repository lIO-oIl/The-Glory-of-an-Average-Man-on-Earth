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
import javafx.scene.input.KeyCode;
//Sound
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;
import javafx.scene.media.MediaPlayer.Status;

public class game
{
	Scene game, zone, town;
	Media bg = new Media(new File("YourHometown.mp3").toURI().toString());
	MediaPlayer bgm;
	Timeline timeline;
	String username;
	settingsRun settings;
	Location currentLocation;
	Button mapButton = new Button("Map");
	Button settingsButton = new Button("Settings");
	Button menuButton = new Button("Main Menu");
	worldMap map;
	gameRun menu;
	Stage stage;
	Zone combat = new Zone();
	Town safe;
	
	public void runScene(Stage stg, gameRun mn, worldMap mp, settingsRun s) {
		settings = s;
		map = mp;
		menu = mn;
		stage = stg;
		
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
		bgm.stop();
		
		bg = new Media(new File(newLocation.getMusic()).toURI().toString());
		bgm = new MediaPlayer(bg);
		bgm.play();
		
		timeline = new Timeline(new KeyFrame(Duration.seconds(2), new KeyValue(bgm.volumeProperty(), 1)));
		timeline.play();
		bgm.setCycleCount(bgm.INDEFINITE);
		
		currentLocation = newLocation;
	}
	
	public void returnToGame(Stage stage) {
		runScene(stage, menu, map, settings);
        stage.show();
	}

	public void newSettings(Double bgmVol, Double sfxVol, String name) {
		bgm.setVolume(0.3 * (settings.getBGMVolume()));
		//buttonPlay.setVolume(0.5 * sfxVol / 100);
		username = name;
	}

	public void loadTown(Location current) {
		System.out.println(current);
		System.out.println("Town Loaded");
		Pane layout = new Pane();
		town = new Scene(layout, 1280, 720);

		mapButton.setOnAction(e ->{map.runScene(stage, this);});
		menuButton.setOnAction(e ->{
			menu.runScene(stage);
			bgm.stop();
		});

		menuButton.relocate(0, 30);

		settingsButton.setOnAction(e -> settings.runScene(stage, menu, town));
		settingsButton.relocate(0, 60);

		layout.getChildren().addAll(mapButton, settingsButton, menuButton);
		town.getStylesheets().add("game.css");
		stage.setScene(town);
		stage.show();
	}

	public void loadZone(Location current) {
		System.out.println(current);
		System.out.println("Zone Loaded");
		Pane layout = new Pane();
		zone = new Scene(layout, 1280, 720);

		mapButton.setOnAction(e ->{map.runScene(stage, this);});
		menuButton.setOnAction(e ->{
			menu.runScene(stage);
			bgm.stop();
		});

		menuButton.relocate(0, 30);

		settingsButton.setOnAction(e -> settings.runScene(stage, menu, zone));
		settingsButton.relocate(0, 60);

		zone.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.NUMPAD1 || e.getCode() == KeyCode.DIGIT1) {
				combat.runZone(current, 1);
			}
			if (e.getCode() == KeyCode.NUMPAD2 || e.getCode() == KeyCode.DIGIT2) {
				combat.runZone(current, 2);
			}
		});

		layout.getChildren().addAll(mapButton, settingsButton, menuButton);
		zone.getStylesheets().add("game.css");
		stage.setScene(zone);
		stage.show();
	}
	public void start() {
		System.out.println("Started");
		bgm = new MediaPlayer(bg);
		if(!bgm.getStatus().equals(Status.PLAYING)){
			bgm.play();
		}
	}
}