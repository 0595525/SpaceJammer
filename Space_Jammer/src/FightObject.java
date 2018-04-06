import java.util.HashSet;
import java.util.Set;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public abstract class FightObject {
	
	protected SceneControl scene;
	protected Hero heroObject;
	protected Rectangle hero;
	protected Set<Bullet> BulletObjects;
	protected long counter = 2L;
	protected Group heroBullet;
	protected Group root;
	public int count = 0;
	
	//game over
	protected void lost() {
		scene.GameOver(scene);
	}
	
	protected void addhero() {
		heroObject = new Hero();
		hero = heroObject.getHero();
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

	protected void moveBullet() {
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
				count++;
				return true;
			}
		}
			
		return false;
		
	}
	
	//protected void check
	protected void EnemyHitHero(Rectangle enemy) {
		if (hero.getBoundsInLocal().intersects(enemy.getBoundsInLocal())) {
			lost();
			count--;
		}
	}
	protected void shoot(String direction) {
		Bullet BulletObject = new Bullet(Hero.bulletSize, Color.RED, direction, hero);
		BulletObjects.add(BulletObject);
		updateBullet();
		
	}
}
