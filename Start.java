//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/*
 * This is the start class, and it is extends the the abstract class FightObjuct  
 * 
 */


public class Start extends FightObject implements IScene {

	//
	private Scene FightScene;
	private Group enemies;

	
	
	//Constructor for the Start class
	public Start (SceneControl scene) {
		this.scene = scene;
	}
	
	
	// 	
	@Override
	public Scene init(int width, int height) {
		// TODO Auto-generated method stub
		root = new Group();
		FightScene = new Scene (root, width, height, Color.BLACK);
	    AddText(); // add the score
		addhero(); // add hero recatangle 
		AddEnemies(); // add enemy recatangle 
		addheroBullet();  // add bullet 
		FightScene.setOnKeyPressed(e -> PressKey(e.getCode()));//eventhandle 
		return FightScene;
	}
	
	//add enemy 
	private void AddEnemies() {
		// TODO Auto-generated method stub
		enemies = new Group();
		root.getChildren().add(enemies);		
	}

	// Handle keyboard inputs that affect the bullet dirction 
	private void PressKey(KeyCode key) {
		// TODO Auto-generated method stub
		switch (key) {
		case SPACE:
			shoot("UP");
			break;
		case W: 
			shoot("UP");
			break;
		case A: 
			shoot("RIGHT");
			break;
		case D: 
			shoot("LEFT");
			break;
		case Q: 
			Restart();
			break;
		default:
			heroObject.handlePlayerKey(key);
		}	
	}

	
	
	public void point (double sce) {
		
		if (counter % EnemyShowRate() == 0) {
			createEnemy();
		}		
		EnemyMove(); // move enemy
		MoveBullet(); // move bullet
		ShootEnemy(); // check the 
		AddScoreText(); // update the score 
		EnemyHitHero(); //lose when enemy hit hero
		MissEnemy(); // lose when the enemy hit the botton of the scene
		
		counter++;
	}
	
	
	private void AddScoreText() {
		UppdateScore("Score: " , super.Score);	
	}

	private void EnemyMove() {
		for (Node enemyNode : enemies.getChildren()){
			Rectangle enemy = (Rectangle) enemyNode;
			enemy.setY(enemy.getY() + EnemyspeedRate());
		}
	}
	
	private void ShootEnemy() {
		removeEnemy(enemies, true);
		
	}
	
	private void EnemyHitHero() {
		for (Node enemyNode : enemies.getChildren()) {
			Rectangle enemy = (Rectangle) enemyNode;
			EnemyHitHero(enemy);
		}
	}
	
	private void MissEnemy() {
		for (Node enemyNode : enemies.getChildren()) {
			Rectangle enemy = (Rectangle) enemyNode;
			if (enemy.getY() + Enemy.HEIGHT > Main.SIZE) {
				lost();
			}
		}
	}

	
	private void createEnemy() {
		// TODO Auto-generated method stub
		Enemy enemyObject = new Enemy();
		Rectangle enemy = enemyObject.GetEnemy();
		enemies.getChildren().add(enemy);
	}

	private int EnemyShowRate() {
		// TODO Auto-generated method stub
		int showRate = 150;
		return showRate;
	}
	
	private double EnemyspeedRate() {
		double speedRate = 2;
		return speedRate;
	}
}
