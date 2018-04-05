import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.*;


public class SceneControl {
	private Stage stage;
	private Timeline animation;
	//private 
	public static int Msecond = 1000 / 60;
	public static double second = 1 / 60;
	
	public SceneControl (Stage primaryStage) {
		this.stage = primaryStage;
		this.animation = new Timeline();
		stage.show();	
	}
	
	
	
/** **/
		
	//to the menu scene done
	public  void MenuScene(SceneControl scene) {
		animation.stop();
		StartMenu menu = new StartMenu(scene);
		Scene menuScene = menu.init(Main.SIZE, Main.SIZE);
		stage.setScene(menuScene);
	}
	
	// to the Startscene
	public void startFight (SceneControl scene ) {
		Start fight = new Start(scene);
		Scene FightScene = fight.init(Main.SIZE, Main.SIZE);
		stage.setScene(FightScene);
		KeyFrame frame = new KeyFrame(Duration.millis(Msecond), e-> fight.point(second));	
		setLoop(frame);
	}
	//done
	public void GameOver(SceneControl scene) {
		animation.stop();
		Lost lost = new Lost(scene);
		Scene lostScene = lost.init(Main.SIZE, Main.SIZE);
		stage.setScene(lostScene);
		
	}
	
	
	private void setLoop(KeyFrame frame) {
		animation = new Timeline();
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.getKeyFrames().add(frame);
		animation.play();
	}
}
