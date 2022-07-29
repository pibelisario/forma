package intities;

import intities.enums.Color;

public class Circle extends Shape{

	
	private Double radius;
	
	public Circle() {
		super();
	}
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return 2 * Math.PI * Math.pow(radius, 2);
	}

}
