import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		
		
		int i, x = sc.nextInt(),a=1;
		
		for (i=0;i<x;i++) {
			
			System.out.print(a+",");
			System.out.print(a*a+",");
			System.out.println(a*a*a);
			a+=1;
		}
		
		
		sc.close();
	}
}
