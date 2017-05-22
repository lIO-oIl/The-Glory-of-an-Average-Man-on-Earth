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
import javafx.event.*;
import javafx.geometry.Pos;
//Sound
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class worldMap
{
	Location YourHometown, Beach, Forest, Caves, Artics, TheCity, Junkyard, Warzone, AbandonedMines, TheMonastery, AMistyVillage, Temple, Atlantis, SkyGarden, GreatRuins, TheWanderersOutpost, AncientTower, HauntedMansion, UFOCrashSite, UnfinishedLevel;
	Button backToGame = new Button("<<");
	Location newLocation;
	Label hovered = new Label("Default Text");
	Label detailed = new Label("Default Text");
	Label percent = new Label("Default Text");
	Scene map;	
	Button hometownButton = new Button();
	Button beachButton = new Button();
	Button forestButton = new Button();
	Button caveButton = new Button();
	Button articButton = new Button();
	
	Button cityButton = new Button();
	Button junkyardButton = new Button();
	Button warzoneButton = new Button();
	Button minesButton = new Button();
	Button monasteryButton = new Button();
	
	Button villageButton = new Button();
	Button templeButton = new Button();
	Button atlantisButton = new Button();
	Button skyButton = new Button();
	Button ruinsButton = new Button();
	
	Button outpostButton = new Button();
	Button towerButton = new Button();
	Button mansionButton = new Button();
	Button ufoButton = new Button();
	Button unfinishedButton = new Button();

	
	public void runScene(Stage stage, game Game) {
		detailed.setMaxWidth(Double.MAX_VALUE);
		detailed.setAlignment(Pos.CENTER);
		percent.setMaxWidth(Double.MAX_VALUE);
		percent.setAlignment(Pos.CENTER);
		
		Pane layout = new Pane();
		
		detailed.relocate(0, 600);
		percent.relocate(0, 640);
		getCurrent();
		
		hovered.relocate(-1000, -1000);
		backToGame.relocate(10, 0);
		detailed.getStyleClass().add("areaStats");
		percent.getStyleClass().add("areaStats");
		backToGame.setOnAction(e ->{
			Game.returnToGame(stage);
		});
		
		hometownButton.setOnAction(e ->{
			if(newLocation != YourHometown)
			{
				newLocation = YourHometown;
				Game.updateLocation(newLocation);
				revertLocations();
				hometownButton.getStyleClass().add("here");
				hometownButton.relocate(80, 160-5);
			}
		});
		
		beachButton.setOnAction(e ->{
			if(newLocation != Beach)
			{
				newLocation = Beach;
				Game.updateLocation(newLocation);
				revertLocations();
				beachButton.getStyleClass().add("here");
				beachButton.relocate(180-5, 280-7);
			}
		});
		
		forestButton.setOnAction(e ->{
			if(newLocation != Forest)
			{
				newLocation = Forest;
				Game.updateLocation(newLocation);
				revertLocations();
				forestButton.getStyleClass().add("here");
				forestButton.relocate(320-5, 260-7);
			}
		});
		
		caveButton.setOnAction(e ->{
			if(newLocation != Caves)
			{
				newLocation = Caves;
				Game.updateLocation(newLocation);
				revertLocations();
				caveButton.getStyleClass().add("here");
				caveButton.relocate(250-5, 310-7);
			}
		});
		
		articButton.setOnAction(e ->{
			if(newLocation != Artics)
			{
				newLocation = Artics;
				Game.updateLocation(newLocation);
				revertLocations();
				articButton.getStyleClass().add("here");
				articButton.relocate(455-5, 90-7);
			}
		});
		
		cityButton.setOnAction(e ->{
			if(newLocation != TheCity)
			{
				newLocation = TheCity;
				Game.updateLocation(newLocation);
				revertLocations();
				cityButton.getStyleClass().add("here");
				cityButton.relocate(350, 500-5);
			}
		});
		
		junkyardButton.setOnAction(e ->{
			if(newLocation != Junkyard)
			{
				newLocation = Junkyard;
				Game.updateLocation(newLocation);
				revertLocations();
				junkyardButton.getStyleClass().add("here");
				junkyardButton.relocate(375-5, 580-7);
			}
		});
		
		warzoneButton.setOnAction(e ->{
			if(newLocation != Warzone)
			{
				newLocation = Warzone;
				Game.updateLocation(newLocation);
				revertLocations();
				warzoneButton.getStyleClass().add("here");
				warzoneButton.relocate(350-5, 360-7);
			}
		});
		
		minesButton.setOnAction(e ->{
			if(newLocation != AbandonedMines)
			{
				newLocation = AbandonedMines;
				Game.updateLocation(newLocation);
				revertLocations();
				minesButton.getStyleClass().add("here");
				minesButton.relocate(370-5, 425-7);
			}
		});
		
		monasteryButton.setOnAction(e ->{
			if(newLocation != TheMonastery)
			{
				newLocation = TheMonastery;
				Game.updateLocation(newLocation);
				revertLocations();
				monasteryButton.getStyleClass().add("here");
				monasteryButton.relocate(460-5, 475-7);
			}
		});
		
		villageButton.setOnAction(e ->{
			if(newLocation != AMistyVillage)
			{
				newLocation = AMistyVillage;
				Game.updateLocation(newLocation);
				revertLocations();
				villageButton.getStyleClass().add("here");
				villageButton.relocate(690, 300-5);
			}
		});
		
		templeButton.setOnAction(e ->{
			if(newLocation != Temple)
			{
				newLocation = Temple;
				Game.updateLocation(newLocation);
				revertLocations();
				templeButton.getStyleClass().add("here");
				templeButton.relocate(590-5, 340-7);
			}
		});
		
		atlantisButton.setOnAction(e ->{
			if(newLocation != Atlantis)
			{
				newLocation = Atlantis;
				Game.updateLocation(newLocation);
				revertLocations();
				atlantisButton.getStyleClass().add("here");
				atlantisButton.relocate(510-5, 290-7);
			}
		});
		
		skyButton.setOnAction(e ->{
			if(newLocation != SkyGarden)
			{
				newLocation = SkyGarden;
				Game.updateLocation(newLocation);
				revertLocations();
				skyButton.getStyleClass().add("here");
				skyButton.relocate(680-5, 470-7);
			}
		});
		
		ruinsButton.setOnAction(e ->{
			if(newLocation != GreatRuins)
			{
				newLocation = GreatRuins;
				Game.updateLocation(newLocation);
				revertLocations();
				ruinsButton.getStyleClass().add("here");
				ruinsButton.relocate(690-5, 255-7);
			}
		});
		
		outpostButton.setOnAction(e ->{
			if(newLocation != TheWanderersOutpost)
			{
				newLocation = TheWanderersOutpost;
				Game.updateLocation(newLocation);
				revertLocations();
				outpostButton.getStyleClass().add("here");
				outpostButton.relocate(810, 240-5);
			}
		});
		
		towerButton.setOnAction(e ->{
			if(newLocation != AncientTower)
			{
				newLocation = AncientTower;
				Game.updateLocation(newLocation);
				revertLocations();
				towerButton.getStyleClass().add("here");
				towerButton.relocate(875-5, 280-7);
			}
		});
		
		mansionButton.setOnAction(e ->{
			if(newLocation != HauntedMansion)
			{
				newLocation = HauntedMansion;
				Game.updateLocation(newLocation);
				revertLocations();
				mansionButton.getStyleClass().add("here");
				mansionButton.relocate(1080-5, 270-7);
			}
		});
		
		ufoButton.setOnAction(e ->{
			if(newLocation != UFOCrashSite)
			{
				newLocation = UFOCrashSite;
				Game.updateLocation(newLocation);
				revertLocations();
				ufoButton.getStyleClass().add("here");
				ufoButton.relocate(1050-5, 535-7);
			}
		});
		
		unfinishedButton.setOnAction(e ->{
			if(newLocation != UnfinishedLevel)
			{
				newLocation = UnfinishedLevel;
				Game.updateLocation(newLocation);
				revertLocations();
				unfinishedButton.getStyleClass().add("here");
				unfinishedButton.relocate(975-5, 110-7);
			}
		});
		
		Button[] buttons = {hometownButton, beachButton, forestButton, caveButton, articButton, cityButton, junkyardButton, warzoneButton, minesButton, monasteryButton, villageButton, templeButton, atlantisButton, skyButton, ruinsButton, outpostButton, towerButton, mansionButton, ufoButton, unfinishedButton};
		Location[] locations = {YourHometown, Beach, Forest, Caves, Artics, TheCity, Junkyard, Warzone, AbandonedMines, TheMonastery, AMistyVillage, Temple, Atlantis, SkyGarden, GreatRuins, TheWanderersOutpost, AncientTower, HauntedMansion, UFOCrashSite, UnfinishedLevel};
		for(int i = 0; i < buttons.length; i++) {
			Location item = locations[i];
			buttons[i].setOnMouseEntered(e->{
				move(item, e.getSceneX() + 10, e.getSceneY() - 10);
			});
			buttons[i].setOnMouseExited(e->{
				hovered.relocate(-1000, -1000);
				getCurrent();
			});
		}
		
		map = new Scene(layout, 1280, 720);
        layout.getChildren().addAll(backToGame, hovered, detailed, percent, hometownButton, beachButton, forestButton, caveButton, articButton);
        layout.getChildren().addAll(cityButton, junkyardButton, warzoneButton, minesButton, monasteryButton);
        layout.getChildren().addAll(villageButton, templeButton, atlantisButton, skyButton, ruinsButton);
        layout.getChildren().addAll(outpostButton, towerButton, mansionButton, ufoButton, unfinishedButton);
		map.getStylesheets().add("worldMap.css");
		stage.setScene(map);
        stage.show();
	}	
	
	public void createLocations()
	{
		YourHometown = new Location("Your Hometown", "Everyone smiles here and talks about sunshines and rainbows. It has a familiar scent of roasted pigs and handknit socks.", "YourHometown.mp3", "Town", 0);
		newLocation = YourHometown;
		Beach = new Location("Beach", "It's Beachy", "Beach.mp3", "Zone", 0);
		Forest = new Location("Forest", "It's Beachy", "Forest.mp3", "Zone", 0);
		Caves = new Location("Caves", "It's Beachy", "Caves.mp3", "Zone", 0);
		Artics = new Location("Artics", "It's Beachy", "Artics.mp3", "Zone", 0);
		TheCity = new Location("The City", "It's Beachy", "TheCity.mp3", "Town", 0);
		Junkyard = new Location("Junkyard", "It's Beachy", "Junkyard.mp3", "Zone", 0);
		Warzone = new Location("Warzone", "It's Beachy", "Warzone.mp3", "Zone", 0);
		AbandonedMines = new Location("Abandoned Mines", "It's Beachy", "AbandonedMines.mp3", "Zone", 0);
		TheMonastery = new Location("The Monastery", "It's Beachy", "TheMonastery.mp3", "Zone", 0);
		AMistyVillage = new Location("A Misty Village", "It's Beachy", "AMistyVillage.mp3", "Town", 0);
		Temple = new Location("Temple", "It's Beachy", "Temple.mp3", "Zone", 0);
		Atlantis = new Location("Atlantis", "It's Beachy", "Atlantis.mp3", "Zone", 0);
		SkyGarden = new Location("Sky Garden", "It's Beachy", "SkyGarden.mp3", "Zone", 0);
		GreatRuins = new Location("Great Ruins", "It's Beachy", "GreatRuins.mp3", "Zone", 0);
		TheWanderersOutpost = new Location("The Wanderer's Outpost", "It's Beachy", "TheWanderersOutpost.mp3", "Town", 0);
		AncientTower = new Location("Ancient Tower", "It's Beachy", "AncientTower.mp3", "Zone", 0);
		HauntedMansion = new Location("Haunted Mansion", "It's Beachy", "HauntedMansion.mp3", "Zone", 0);
		UFOCrashSite = new Location("U.F.O. Crash Site", "It's Beachy", "UFOCrashSite.mp3", "Zone", 0);
		UnfinishedLevel = new Location("Unfinished Level", "It's Beachy", "UnfinishedLevel.mp3", "Zone", 0);
		YourHometown.setGrade("I");
		TheCity.setGrade("II");
		AMistyVillage.setGrade("III");
		TheWanderersOutpost.setGrade("IV");
		revertLocations();
	}
	
	public void startGame(game Game)
	{
		Game.updateLocation(newLocation);
		hometownButton.getStyleClass().add("here");
	}
	
	public void revertLocations()
	{
		hometownButton.getStyleClass().clear();  
		hometownButton.getStyleClass().add("town");
		hometownButton.relocate(80, 160);
		beachButton.getStyleClass().clear();
		beachButton.getStyleClass().add("green");
		beachButton.relocate(180, 280);
		forestButton.getStyleClass().clear();
		forestButton.getStyleClass().add("green");
		forestButton.relocate(320, 260);
		caveButton.getStyleClass().clear();
		caveButton.getStyleClass().add("green");
		caveButton.relocate(250, 310);
		articButton.getStyleClass().clear();
		articButton.getStyleClass().add("green");
		articButton.relocate(455, 90);
		
		cityButton.getStyleClass().clear();
		cityButton.getStyleClass().add("town");
		cityButton.relocate(350, 500);
		junkyardButton.getStyleClass().clear();
		junkyardButton.getStyleClass().add("yellow");
		junkyardButton.relocate(375, 580);
		warzoneButton.getStyleClass().clear();
		warzoneButton.getStyleClass().add("yellow");
		warzoneButton.relocate(350, 360);
		minesButton.getStyleClass().clear();
		minesButton.getStyleClass().add("yellow");
		minesButton.relocate(370, 425);
		monasteryButton.getStyleClass().clear();
		monasteryButton.getStyleClass().add("yellow");
		monasteryButton.relocate(460, 475);
		
		villageButton.getStyleClass().clear();
		villageButton.getStyleClass().add("town");
		villageButton.relocate(690, 300);
		templeButton.getStyleClass().clear();
		templeButton.getStyleClass().add("orange");
		templeButton.relocate(590, 340);
		atlantisButton.getStyleClass().clear();
		atlantisButton.getStyleClass().add("orange");
		atlantisButton.relocate(510, 290);
		skyButton.getStyleClass().clear();
		skyButton.getStyleClass().add("orange");
		skyButton.relocate(680, 470);
		ruinsButton.getStyleClass().clear();
		ruinsButton.getStyleClass().add("orange");
		ruinsButton.relocate(690, 255);
		
		outpostButton.getStyleClass().clear();
		outpostButton.getStyleClass().add("town");
		outpostButton.relocate(810, 240);
		towerButton.getStyleClass().clear();
		towerButton.getStyleClass().add("red");
		towerButton.relocate(875, 280);
		mansionButton.getStyleClass().clear();
		mansionButton.getStyleClass().add("red");
		mansionButton.relocate(1080, 270);
		ufoButton.getStyleClass().clear();
		ufoButton.getStyleClass().add("red");
		ufoButton.relocate(1050, 535);
		unfinishedButton.getStyleClass().clear();
		unfinishedButton.getStyleClass().add("red");
		unfinishedButton.relocate(975, 110);
	}
	
	public void move(Location item, double eX, double eY)
	{
		hovered.setText(item.toString());
		detailed.setText(item.toString());
		if(item.getType().equals("Zone"))
			percent.setText("Completion: " + item.getCompletion());
		else
			percent.setText(item.getGrade());
		hovered.relocate(eX, eY);
	}
	
	public void getCurrent()
	{
		detailed.setText(newLocation.toString());
		if(newLocation.getType().equals("Zone"))
			percent.setText("Completion: " + newLocation.getCompletion());
		else
			percent.setText(newLocation.getGrade());
	}
}