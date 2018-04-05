import java.util.HashSet;
import java.util.Set;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public abstract class FightObject {
	
	protected SceneControl scene;
	protected Hero heroObject;
	protected Rectangle hero;
	protected Set<Bullet> BulletObjects;
	protected long counter = 0L;
	protected Group heroBullet;
	protected Group root;
	private int Score;
	
	protected void Restart() {
		scene.MenuScene(scene);
	}
	
	//game over
	protected void lost() {
		scene.GameOver(scene);
	}
	
	protected void addhero() {
		heroObject = new Hero();
		hero = heroObject.GetHero();
		root.getChildren().add(hero);
	}
	
	protected void addheroBullet() {
		BulletObjects = new HashSet<Bullet>();
	}
	
	protected void updateBullet() {
		root.getChildren().remove(heroBullet);
		heroBullet = new Group();
		transferBullet(BulletObjects, heroBullet);
		
		
		
	}
	
	protected void transferBullet(Set<Bullet> bulletSet, Group bullet) {
		// TODO Auto-generated method stub
		for (Bullet BulletObject : bulletSet) {
			bullet.getChildren().add(BulletObject.getBullet());	
		}
		root.getChildren().add(bullet);
	}

	protected void MoveBullet() {
		for (Bullet BulletObject : BulletObjects) {
			BulletObject.move();
		}
		updateBullet();
	
	}
	
	protected boolean HitEnemy ( Set<Bullet> bulletSet, Group bullets, Rectangle r) {
		for (Bullet BulletObject : bulletSet) {
			Rectangle bullet = BulletObject.getBullet();
			if (bullet.getBoundsInLocal().intersects(r.getBoundsInLocal())) {
				bulletSet.remove(BulletObject);
				bullets.getChildren().remove(bullet);
				
				setScore(getScore() + 1);
				return true;
			}
		}
			
		return false;
		
	}
	
	//to 
	protected void HitEnemyInGroup (Group group, boolean remove) {
		for(Node node : group.getChildren()) {
			Rectangle r = (Rectangle) node;
			if (HitEnemy(BulletObjects,heroBullet,r)) {
				if (remove) {
					group.getChildren().remove(r);
				}
				return;
			}
		}	
		
	}
	
	//protected void check
	protected void EnemyHitHero(Rectangle enemy) {
		if (hero.getBoundsInLocal().intersects(enemy.getBoundsInLocal())) {
			lost();
		}
	}
	protected void shoot(String direction) {
		Bullet BulletObject = new Bullet(Hero.bulletSize, Color.RED, direction, hero);
		BulletObjects.add(BulletObject);
		updateBullet();
		
	}

	public int getScore() {
		return Score;
	}

	public void setScore(int score) {
		Score = score;
	}
}
