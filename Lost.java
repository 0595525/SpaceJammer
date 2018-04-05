import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class Lost implements SceneInterface{

	private SceneControl scene;
	private Scene lost;
	private Group root;

	public Lost (SceneControl scene) {
		this.scene = scene;
		 
	}

	@Override
	public Scene init(int width, int height) {
		// TODO Auto-generated method stub
		root = new Group();
		lost = new Scene(root, width, height, Color.RED);
		//addLostText();
		//addStartButton();
		return lost;
	}
	/*
	public void addLostText() {
		Text lostText = Object.createT("Game Over !! " , 60, 60);
		root.getChildren().add(lostText);
	}
	public void addStartButton() {
		Button startButton = Object.createB("Again", 60, 100);
		startButton.setOnAction(new EventHandler<ActingEVENT>(){
			@Override
			public void handle(ActionEvent event) {
				SceneControl.ToStartScene (scene);
			}
			
		});
		root.getChildren().add(againButton)
	}
	*/
}
