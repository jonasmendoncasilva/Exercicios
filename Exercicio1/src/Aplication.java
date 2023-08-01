import java.util.Scanner;

import Entities.Rectangle;

public class Aplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		Rectangle r = new Rectangle ();
		
		System.out.println("Enter with the width and height of Rectangle");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println("AREA = "+r.area());
		System.out.println("PERIMETER = "+r.perimeter());
		System.out.println("DIAGONAL = "+r.diagonal());
	}

}
