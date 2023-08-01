import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você vai digitar?");
		int n = sc.nextInt();
		double[] v = new double[n];
		double sum=0;
		
		for(int i=0;i<v.length;i++) {
			System.out.print("Enter a number: ");
			v[i] = sc.nextDouble();
		}
		System.out.print("VALORES: ");
		for(int i=0;i<v.length;i++) {
			System.out.print(v[i]+" ");
			sum += v[i];
		}
		System.out.println();
		System.out.println("SOMA = "+sum);
		System.out.println("MEDIA = "+sum/v.length);
		
		sc.close();
	}	
}

