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
//Sound
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class worldMap
{
	Location YourHometown, Beach, Forest, Caves, Artics, TheCity, Junkyard, Warzone, AbandonedMines, TheMonastery, AMistyVillage, Temple, Atlantis, SkyGarden, GreatRuins, AncientTower, HauntedMansion, UFOCrashSite, UnfinishedLevel;
	Button backToGame = new Button("<<");
	Location newLocation;
	Scene map;
	
	public void runScene(Stage stage, game Game) {
		Pane layout = new Pane();
		
		Button beachButton = new Button("x");
		beachButton.relocate(10, 10);
		
		backToGame.setOnAction(e ->{
			Game.returnToGame(stage);
		});
		
		beachButton.setOnAction(e ->{
			newLocation = Beach;
			Game.updateLocation(newLocation);
		});
		
		map = new Scene(layout, 1280, 720);
        layout.getChildren().addAll(backToGame, beachButton);
		map.getStylesheets().add("worldMap.css");
		stage.setScene(map);
        stage.show();
	}	
	
	public void createLocations()
	{
		YourHometown = new Location("Your Hometown", "Everyone smiles here and talks about sunshines and rainbows. It has a familiar scent of roasted pigs and handknit socks.", "YourHometown.mp3", "Town");
		newLocation = YourHometown;
		Beach = new Location("Beach", "It's Beachy", "Beach.mp3", "Zone");
	}
	
	public void startGame(game Game)
	{
		Game.updateLocation(newLocation);
	}
}