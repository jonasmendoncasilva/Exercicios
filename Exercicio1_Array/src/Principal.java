import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Quantos números você irá digitar?");
		int n = sc.nextInt();
		
		int[] v = new int[n];
	
		for(int i=0;i<v.length;i++) {
			System.out.println("Digite um número: ");
			v[i] = sc.nextInt();
		}
		
		System.out.println("NÚMEROS NEGATIVOS");
		for(int i=0;i<v.length;i++) {
			if (v[i]<0) {
				System.out.println(v[i]);
			}
		}
		sc.close();
	}
}
