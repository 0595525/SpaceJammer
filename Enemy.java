import java.util.Random;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Enemy {
	public static double WIDTH = 30;
	public static double HEIGHT = 30;
	
	private Rectangle enemy;
	
	// constructor for enemy 
	public Enemy() {
		this.enemy = Object.createR(Color.BLACK, RandomEnemyX(), 0, WIDTH, HEIGHT);
	}
	public Rectangle getEnemy() {
		return enemy;
	}
	private double RandomEnemyX() {
		Random E = new Random();
			return (Main.SIZE - WIDTH) * E.nextDouble();
	}
}
