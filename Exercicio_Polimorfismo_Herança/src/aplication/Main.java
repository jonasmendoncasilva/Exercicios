package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) throws ParseException {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		Date date;
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<Product>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Product #"+i+" data:");
			System.out.print("Common, used or imported (c/u/i)?");
			String respond = sc.next();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(respond.equals("i")) {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
			
				list.add(new ImportedProduct(name,price,customsFee));
			}
			else if(respond.equals("u")) {
				System.out.print("Manufacture date (DD/MM/YYYY):  ");
				date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name,price,date));
			}
			else {
				list.add(new Product(name,price));
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Product p: list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	
	}
}
