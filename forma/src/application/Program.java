package application;

import entities.enums.WorkerLevel;
import intities.Circle;
import intities.Rectangle;
import intities.enums.Color;

public class Program {
	
	public static void main(String[] args) {
		
		String color = "RED";
		
		Color c = new Color
		
		Rectangle rec = new Rectangle(WorkerLevel.valueOf(workerLevel), 10.0, 10.0);
		
		System.out.println(rec.area());
		
		Circle cir = new Circle(2.0);
		
		System.out.println(cir.area());
		
	}
	
	
	
	

}
