import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application  {

	public static int SIZE = 800;
	private String score;
	//private Label lblScore = new Label("Score: " + score);


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
		primaryStage.setTitle("Space Jammer");
    		SceneControl scene = new SceneControl(primaryStage);
    		scene.MenuScene(scene);
    		
    		
    		/*
    		final TextField TF = new TextField();
    		TF.setPromptText("Enter Play Name");
    		TF.setPrefColumnCount(20);
    		TF.getText();
    		GridPane.setConstraints(TF,0,0);
    		*/
		
		
	}
	public static void main (String[] args) {
		launch (args);
	}

}
