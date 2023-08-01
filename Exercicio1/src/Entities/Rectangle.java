package Entities;

public class Rectangle {

	public double width, height;
	
	public double area() {
		double a = width * height; 
		return a;
	}
	
	public double perimeter () {
		double p = 2.00*(width+height);
		return p;
	}
	
	public double diagonal() {
		double d = Math.sqrt(width*height);
		return d;
	}
}
