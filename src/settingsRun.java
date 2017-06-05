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

public class settingsRun
{
	Slider bgmAdjust = new Slider();
	Slider sfxAdjust = new Slider();
	Button backButton = new Button();
	Boolean active = false;
	Button bgmMute = new Button("Mute");
	Double bgmLast;
	Button sfxMute = new Button("Mute");
	Double sfxLast;
	Button allMute = new Button("Mute");
	TextField nameText = new TextField("Player");
	MediaPlayer buttonPlay;
	Scene settings;
	
	public void runScene(Stage stage, gameRun menu, Scene prev) {
		Pane layout = new Pane();
		
		bgmAdjust.setMin(0);
		bgmAdjust.setMax(200);
		bgmAdjust.setShowTickLabels(true);
		bgmAdjust.setMajorTickUnit(100);
		
		sfxAdjust.setMin(0);
		sfxAdjust.setMax(200);
		sfxAdjust.setShowTickLabels(true);
		sfxAdjust.setMajorTickUnit(100);
		
		if(active == false)
		{
			bgmAdjust.setValue(100);
			sfxAdjust.setValue(100);
		}
		
		Line volumeSeperator = new Line(585, 468, 815, 468);
		volumeSeperator.setStroke(Color.WHITE);
		volumeSeperator.setStrokeWidth(2);
		
		Line seperator = new Line(380, 425, 900, 425);
		seperator.setStroke(Color.WHITE);
		seperator.setStrokeWidth(2);
		
		backButton = new Button("Apply");
		Label volumeLabel = new Label("Volume Control");
		Label bgmLabel = new Label("Background Music:");
		Label sfxLabel = new Label("Sound Effects:");
		Label nameLabel = new Label("Username");
		
		nameLabel.relocate(575, 300);
		nameText.relocate(575, 350);
		backButton.relocate(380, 600);
		volumeLabel.relocate(380, 450);
		bgmLabel.relocate(380, 500);
		sfxLabel.relocate(380, 550);
		bgmAdjust.relocate(615, 500);
		sfxAdjust.relocate(615, 550);
		allMute.relocate(825, 450);
		bgmMute.relocate(825, 500);
		sfxMute.relocate(825, 550);

		backButton.setOnAction(e ->{
			if(sfxMute.getText().equals("Unmute")) {
				sfxAdjust.setValue(0.0);
			}
			menu.newSettings(bgmAdjust.getValue(), sfxAdjust.getValue(), nameText.getText());
			stage.setScene(prev);
			stage.show();
			active = true;
		});
		
		bgmMute.setOnAction(e ->{
			if (bgmMute.getText().equals("Mute"))
			{
				bgmLast = bgmAdjust.getValue();
				bgmAdjust.setValue(0);
				bgmMute.setText("Unmute");
				menu.newSettings(bgmAdjust.getValue(), sfxAdjust.getValue(), nameText.getText());
				buttonPlay.setVolume(sfxAdjust.getValue() / 100);
			}
			else
			{
				bgmAdjust.setValue(bgmLast);
				bgmMute.setText("Mute");
				menu.newSettings(bgmAdjust.getValue(), sfxAdjust.getValue(), nameText.getText());
				buttonPlay.setVolume(sfxAdjust.getValue() / 100);
			}
		});
		
		sfxMute.setOnAction(e ->{
			if (sfxMute.getText().equals("Mute"))
			{
				sfxLast = sfxAdjust.getValue();
				sfxAdjust.setValue(0);
				sfxMute.setText("Unmute");
				menu.newSettings(bgmAdjust.getValue(), sfxAdjust.getValue(), nameText.getText());
				buttonPlay.setVolume(sfxAdjust.getValue() / 100);
			}
			else
			{
				sfxAdjust.setValue(sfxLast);
				sfxMute.setText("Mute");
				menu.newSettings(bgmAdjust.getValue(), sfxAdjust.getValue(), nameText.getText());
				buttonPlay.setVolume(sfxAdjust.getValue() / 100);
			}
		});
		
		allMute.setOnAction(e ->{
			if(sfxAdjust.getValue()!=0)
				sfxLast = sfxAdjust.getValue();
			if(bgmAdjust.getValue()!=0)
				bgmLast = bgmAdjust.getValue();
			sfxAdjust.setValue(0);
			sfxMute.setText("Unmute");
			bgmAdjust.setValue(0);
			bgmMute.setText("Unmute");
			menu.newSettings(bgmAdjust.getValue(), sfxAdjust.getValue(), nameText.getText());
			buttonPlay.setVolume(sfxAdjust.getValue() / 100);
		});
		
		Button[] allButtons = {backButton, bgmMute, sfxMute, allMute};
		Media bh = new Media(new File("buttonHover.aiff").toURI().toString());
		buttonPlay = new MediaPlayer(bh);
		for(Button button : allButtons)
		{
				button.setOnMouseEntered(e -> buttonPlay.play());
				button.setOnMouseExited(e -> buttonPlay.stop());
		}
		if(sfxMute.getText().equals("Mute")) {
			buttonPlay.setVolume(sfxAdjust.getValue() / 100);
		}
		else {
			buttonPlay.setVolume(0.0);
		}
		
		settings = new Scene(layout, 1280, 720);
        layout.getChildren().addAll(bgmAdjust, sfxAdjust, backButton, bgmMute, sfxMute, allMute, bgmLabel, sfxLabel, volumeLabel, seperator, volumeSeperator, nameLabel, nameText);
		settings.getStylesheets().add("settings.css");
		stage.setScene(settings);
        stage.show();
	}
	
	public double getBGMVolume()
	{
		try {
			return bgmAdjust.getValue() / 100;
		}
		catch(Exception IOException){
			return 1;
		}
	}
	public double getSFXVolume()
	{
		return sfxAdjust.getValue()/100;
	}
}