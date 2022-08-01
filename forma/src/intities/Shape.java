package intities;

import intities.enums.Color;

public abstract class Shape {
	
	private Color color;
	
	public Shape() {}
	
	
	
	public Shape(Color color) {
		super();
		this.color = color;
	}



	public abstract double area();
	
	
}
