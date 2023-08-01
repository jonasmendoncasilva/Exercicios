package Aplication;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantos números você quer digitar?");
		int j=0;
		int n = sc.nextInt();
		
		double[] v = new double[n];
		double aux=0;
		
		for(int i=0;i<v.length;i++) {
			System.out.print("Digite um número: ");
			v[i] = sc.nextDouble();
		}
		
		for(int i=0;i<v.length;i++) {
			if(aux<v[i]) {
				aux = v[i];
				j=i;
			}
		}
	
		System.out.println("MAIOR VALOR = "+aux);
		System.out.println("POSIÇÃO DO MAIOR VALOR = "+j);
	
		sc.close();
	}
}
