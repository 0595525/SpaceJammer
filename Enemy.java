//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/*
 	this is the enemy class
	it is for create enemy character, and the class is only instantiates an enemy object.
 	the enemy random move down from the top.
*/


public class Enemy {
	public static final double WIDTH = 50;
	public static final double HEIGHT = 50;
	
	//
	private Rectangle enemy;
	
	// constructor for enemy 
	public Enemy() {
		this.enemy = Object.createR(Color.RED, RandomEnemyX(), 0, WIDTH, HEIGHT);
	}
	
	public Rectangle GetEnemy() {
		return enemy;
	}
	
	private double RandomEnemyX() {
		Random E = new Random();
			return (Main.SIZE - WIDTH) * E.nextDouble();
	}
}
