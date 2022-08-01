package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import intities.Circle;
import intities.Rectangle;
import intities.Shape;
import intities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);

		List<Shape> list = new ArrayList<>();

		System.out.print("Enter with the number of shapes: ");
		int n = in.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" +(1+i)+ "data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char resp = in.next().charAt(0);
			System.out.print("Color (BLAC/BLUE/RED): ");
			String color = in.next();

			if (resp == 'r' || resp == 'R') {
				System.out.print("Width: ");
				double width = in.nextDouble();
				System.out.print("Height: ");
				double height = in.nextDouble();
				
				list.add(new Rectangle(Color.valueOf(color), width, height));
			} else {
				System.out.print("Radius: ");
				double radius = in.nextDouble();
				list.add(new Circle(Color.valueOf(color), radius));
			}

		}
		
		System.out.println();
		System.out.println("SHAPES ARES: ");
		
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}

	}

}
