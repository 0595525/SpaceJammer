import javafx.scene.control.Button;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Object {
	public static double buttonW = 200;
	public static double buttonH = 50;		
	public static int textSize= 25;
	/*
	public static Circle circleC ( Color color, double x, double y, double radius) {
		Circle circle = new Circle();
		circle.setFill(color);
		circle.setCenterX(x);
		circle.setCenterY(y);
		circle.setRadius(radius);
		return circle;
	}
	*/
	public static Button createB(String text, double x, double y) {
		return createB(text, x, y, buttonW, buttonH, textSize);
	}
	
	public static Button createB(String text, double x, double y, double width, double height, int fontSize) {
		Button BT = new Button();
		BT.setText(text);
		BT.setLayoutX(x);
		BT.setLayoutY(y);
		BT.setMinWidth(width);
		BT.setMinHeight(height);
		BT.setFont(Font.font("Bookman", fontSize));
		
		return BT;
	}
	
	
	
	public static Text createT(String text, double x, double y) {
		return createT(text, x, y, textSize);
	}
	
	
	public static Text createT(String text, double x, double y, int textSize ) {
		Text T = new Text();
		T.setText(text);
		T.setX(x);
		T.setY(y);
		T.setFont(Font.font("Bookman", textSize));
		
		
		return T;
		
	}
	
	public static Rectangle createR (Color color, double x, double y, double width, double height) {
		Rectangle rectangle = new Rectangle();
		rectangle.setFill(color);
		rectangle.setX(x);
		rectangle.setY(y);
		rectangle.setWidth(width);
		rectangle.setHeight(height);
		return rectangle;
	}

}
