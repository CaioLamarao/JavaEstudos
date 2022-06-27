package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import model.services.ProductService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(900.00, "TV"));
		list.add(new Product(50.00, "Mouse"));
		list.add(new Product(350.50, "Tablet"));
		list.add(new Product(1200.00, "Computer"));
		list.add(new Product(150.00, "Keyboard"));
		
		ProductService ps = new ProductService();
		
		System.out.println(ps.filteredSum(list, p -> p.getName().charAt(0) == 'T'));
	}

}
