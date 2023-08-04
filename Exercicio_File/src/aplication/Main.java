package aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		String path = "c:\\in.txt";
		
		List<Product> list = new ArrayList<Product>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
		
			String line = br.readLine();
			
			while(line!=null) {
				String[] vect = line.split(",");
				String name = vect[0];
				double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);
				
				Product p = new Product(name,price,quantity);
				list.add(p);
				
				br.readLine();
			}
			
			
		
		
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
