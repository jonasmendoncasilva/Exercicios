import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in); 
		
			int x, i;
			
			x = sc.nextInt();
			
			for(i=0; i<x; i++) {
				
				if (i%2==2) {
					System.out.println(i);
				}
			}
	}
}