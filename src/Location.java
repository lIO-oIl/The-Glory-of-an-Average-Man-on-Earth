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

public class Location
{
	String name, description, bgm, type, grade;
	int percent;
	int progress;
	
	public Location()
	{
		name = "Your Hometown";
		description = "Everyone smiles here and talks about sunshines and rainbows. It has a familiar scent of roasted pigs and handknit socks.";
		bgm = "YourHometown.mp3";
		type = "Town";
		percent = 0;
		progress = 0;
	}
	
	public Location(String n, String d, String m, String t, int p)
	{
		name = n;
		description = d;
		bgm = m;
		type = t;
		percent = 0;
		progress = 0;
	}
	
	public String getDesc()
	{
		return description;
	}
	
	public String getMusic()
	{
		return bgm;
	}
	
	public String getType()
	{
		return type;
	}
	
	public String getCompletion()
	{
		updateCompletion();
		return percent + "%";
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public void setGrade(String g)
	{
		grade = "Grade " + g + " Town";
	}
	
	public void updateCompletion()
	{
		percent = 5 * progress;
	}

	public void setCompletion(int p) {
		progress = p;
	}

	public int getProgress(){
		return progress;
	}
	
	public String toString()
	{
		return name;
	}
}