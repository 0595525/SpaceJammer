//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


// i mean lose  not lost (lol)
public class Lost extends FightObject implements IScene{

	private SceneControl scene;
	private Scene lostScene;
	private Group root;

	
	////Constructor for the lost
	public Lost (SceneControl scene) {
		this.scene = scene;
		
	}

	@Override
	public Scene init(int width, int height) {
		// TODO Auto-generated method stub
		root = new Group();
		lostScene = new Scene(root, width, height, Color.LAVENDER);
		addLostText();
		addStartButton();
		return lostScene;
	}

	//add  lose text message
	public void addLostText() {
		Text lostText = Object.createT("Game Over !! " , 60, 60);	
		root.getChildren().add(lostText);
	}
	
	//add start button
	public void addStartButton() {
		Button startButton = Object.CreateB("Again", 300, 300);
		startButton.setOnAction(new EventHandler<ActionEvent>(){
			
			@Override
			public void handle(ActionEvent event) {
				scene.MenuScene (scene);
			}
			
		});
		root.getChildren().add(startButton);
	}
	
}
