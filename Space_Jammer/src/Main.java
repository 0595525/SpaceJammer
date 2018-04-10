//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb
import javafx.application.Application;


import javafx.stage.Stage;

public class Main extends Application  {

	public static int SIZE = 800;



	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
        
		primaryStage.setTitle("Space Jammer");
		primaryStage.setResizable(false);
		
		SceneControl scene = new SceneControl(primaryStage);
    		scene.MenuScene(scene);
    	  
    		
		
	}
	
	public static void main (String[] args) {
		launch (args);
	}

}
