import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Start extends FightObject implements SceneInterface {
	
	private SceneControl FightScene;
	private Group enemies;
	private double timer = 0.0;
	
	
	public Start (SceneControl scene) {
		this.scene = scene;
	}
			
	
	

	@Override
	public Scene init(int width, int height) {
		// TODO Auto-generated method stub
		root = new Group();
		FightScene = new SceneControl(root, width, height, Color.GRAY);
		
		
		
		return null;
	}
	//
	public void point (double elapsedTime) {
		checkTimeup(elapsedTime);
		if (counter % EnemyshowRate() == 0) {
			createEnemy();
		}
		
		
		counter++;
	}




	private void createEnemy() {
		// TODO Auto-generated method stub
		enemies = new Group();
		root.getChildren().add(enemies);
		
		
	}




	private int EnemyshowRate() {
		// TODO Auto-generated method stub
		int showRate = 150;
		return showRate;
	}
	
	private double EnemyspeedRate() {
		double speedRate = 3;
		return speedRate;
	}



	private void checkTimeup(double elapsedTime) {
		// TODO Auto-generated method stub
;
		
	}
	
}
