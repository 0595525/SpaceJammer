//Reference:
//https://github.com/daniel-chai/javafx-game/tree/master/src
//https://github.com/AlmasB/FXTutorials/tree/master/src/com/almasb

import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/*
 * this is the hero class, it is for create hero character. 
 * and using handles keyboard to control the hero move up, down, left, right 
 */
public class Hero {
	public static double WIDTH = 50;
	public static double HEIGHT = 50;
	//public static double RADIUS = 50;
	public static double bulletSize = 10;
	private Rectangle hero;
	
	public Hero() {
		double  xPosition = Main.SIZE / 2 - WIDTH / 2;
		double  yPosition = Main.SIZE - HEIGHT - 25;
		this.hero = Object.createR(Color.GOLD, xPosition, yPosition, WIDTH, HEIGHT);
	}
	 public Rectangle GetHero() {
		 return hero;
	 }
	 
	 
	 // Handle keyboard inputs that affect the Hero
	 public void handlePlayerKey(KeyCode key) {
		 switch (key) {
		 	case LEFT:
		 		moveLeft();
		 		break;
		 	case RIGHT:
		 		moveRight();
		 		break;
		 	case DOWN:
		 		moveDown();
		 		break;
		 	case UP:
		 		moveUp();
		 		break;
		default:
			break;
		 		
		 }
	 }
	 //
	private void moveUp() {
		// TODO Auto-generated method stub
		if (hero.getY() > 0) {
			hero.setY(hero.getY() - 15);
		
		}
		
	}
	//
	private void moveDown() {
		// TODO Auto-generated method stub
		if (hero.getY() + HEIGHT < Main.SIZE ) {
				hero.setY(hero.getY() + 15 );
		}
	}
	//
	private void moveRight() {
		// TODO Auto-generated method stub
		if ( hero.getX() + WIDTH < Main.SIZE) {
			hero.setX(hero.getX() + 15); 
		}
		
	}
	//
	private void moveLeft() {
		// TODO Auto-generated method stub
		if (hero.getX() > 0) {
			hero.setX(hero.getX() - 15);
		}
	
	}
}
