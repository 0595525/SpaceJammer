//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb

import java.util.HashSet;
import java.util.Set;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/*
 * this is the abstract class. it is the super class for the Start class.
 */


public abstract class FightObject {
	
	protected SceneControl scene;
	protected Hero heroObject;
	protected Rectangle hero;
	protected Set<Bullet> BulletObjects;
	protected long counter = 0L;
	protected Group heroBullet;
	protected Group root;
	protected int Score = 0;
	private Text BottonText;
	
	protected void Restart() {
		scene.MenuScene(scene);
	}
	
	//game over
	protected void lost() {
		scene.GameOver(scene);
	}
		
	// create text at botton for the score 
	protected void AddText () {
	    BottonText = Object.createT("Score: 0", 0, Main.SIZE);
		BottonText.setFill(Color.RED);	
		root.getChildren().add(BottonText);	
	}
	//updateing the score
	protected void UppdateScore(String text, int score) {
		root.getChildren().remove(BottonText);
		BottonText = Object.createT(text + score, 0, Main.SIZE);
		BottonText.setFill(Color.RED);
		root.getChildren().add(BottonText);	
	}
	
	// aad the hero recatangle
	protected void addhero() {
		heroObject = new Hero();
		hero = heroObject.GetHero();
		root.getChildren().add(hero);
	}
	//create the bullet 
	protected void addheroBullet() {
		BulletObjects = new HashSet<Bullet>();
		
	}
	// update the bullet
	protected void updateBullet() {
		root.getChildren().remove(heroBullet);
		heroBullet = new Group();
		transferBullet(BulletObjects, heroBullet);
		
	}
	//For each bullet in the Set, add the corresponding Rectangle to the Group
	protected void transferBullet(Set<Bullet> bulletSet, Group bullet) {
		// TODO Auto-generated method stub
		for (Bullet BulletObject : bulletSet) {
			bullet.getChildren().add(BulletObject.getBullet());	
		}
		root.getChildren().add(bullet);
	}
	
	//move the bullet in the to corret dirction
	protected void MoveBullet() {
		for (Bullet BulletObject : BulletObjects) {
			BulletObject.move();
		}
		updateBullet();
	
	}
	
	//shoot the bullet in up, right and left direction.
	protected void shoot(String direction) {
		Bullet BulletObject = new Bullet(Hero.bulletSize, Color.GOLD, direction, hero);
		BulletObjects.add(BulletObject);
		updateBullet();
		
	}
	// to check if the bullet hit the enemy recatangle
	protected boolean HitEnemy ( Set<Bullet> bulletSet, Group bullets, Rectangle r) {
		for (Bullet BulletObject : bulletSet) {
			Rectangle bullet = BulletObject.getBullet();
			if (bullet.getBoundsInLocal().intersects(r.getBoundsInLocal())) {
				bulletSet.remove(BulletObject);
				bullets.getChildren().remove(bullet);
				//Score = Score+1;
				return true;
			}
		}
			
		return false;
		
	}
	
	// when the hero bullet hit the enemy recatangle, it will remove the enemy recatangle 
	protected void removeEnemy (Group group, boolean remove) {
		for(Node node : group.getChildren()) {
			Rectangle r = (Rectangle) node;
			if (HitEnemy(BulletObjects,heroBullet,r)) {
				Score = Score+1;

				if (remove) {
					group.getChildren().remove(r);
				}
				return;
			}
		}	
		
	}
	
	//  if the enemy recatangle hit hero, lose the game 
	protected void EnemyHitHero(Rectangle enemy) {
		if (hero.getBoundsInLocal().intersects(enemy.getBoundsInLocal())) {
			lost();//i mean lose the game 
		}
	}
	
	
}
