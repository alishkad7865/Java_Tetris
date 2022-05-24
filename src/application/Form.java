package application;
import javafx.scene.paint.*;
import javafx.scene.shape.Rectangle;
public class Form {
	Rectangle a;
	Rectangle b;
	Rectangle c;
	Rectangle d;
	Color color;
	private String name;
	public int form =1;
	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d ) {
		this.a= a;
		this.b= b;
		this.c =c; 
		this.d= d;
	}
	public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name ) {
		this.a= a;
		this.b= b;
		this.c =c; 
		this.d= d;
		this.name = name;
	// set color
	switch(name) {
		case "j":
			color= Color.AQUA;
			break;
		case "l":
			color= Color.DARKCYAN;
			break;
		case "o":
			color= Color.ORANGERED;
			break;
		case "s":
			color= Color.FORESTGREEN;
			break;
		case "t":
			color= Color.HOTPINK;
			break;
		case "z":
			color= Color.SLATEGREY;
			break;
		case "i":
			color= Color.SANDYBROWN;
			break;
	}
	this.a.setFill(color);
	this.b.setFill(color);
	this.c.setFill(color);
	this.d.setFill(color);
	}
	public String getName() {
		return name;
	}
	public void changeForm() {
		if(form !=4) {
			form ++;
		}
		else {
			form =1;
		}
	}
}
