//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;

public class StartMenu implements IScene{

	private SceneControl scene;
	private Scene menu;
	private Group root;
	
	public StartMenu (SceneControl scene) {
		this.scene = scene;
	}
	
	@Override
	public Scene init(int width, int height) {
		// TODO Auto-generated method stub
		root = new Group();
		menu = new Scene(root, width, height, Color.GOLD);
		addStartBT();
		
		return menu;
	}

	private void addStartBT() {
		// TODO Auto-generated method stub
		Button startBT = Object.CreateB("START", 300, 300);
		startBT.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle( ActionEvent evnet) {
				scene.startFight(scene);
				}
		});
		root.getChildren().add(startBT);
	}
	

}
