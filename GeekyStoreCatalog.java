package Iterater;

import java.util.ArrayList;

public class GeekyStoreCatalog {
	private ArrayList<Product> catalog;
	
	public GeekyStoreCatalog() {
		catalog = new ArrayList<>();
		
		additem("Superman cool", "the best in town", 12.99);
		additem("Batman cool", "okay, but still good", 11.9);
		additem("star wars", "cannot live without it", 39.9);
		additem("Jedi T-shirt", "gotta have it", 29.9);
	}
	
	public void additem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		catalog.add(product);
	}
	
	public ArrayList<Product> getCatalog() {
		return catalog;
	}
	
	public GeekyStoreiterator createGeekyStoreiterator() {
		return new GeekyStoreiterator(catalog);
	}

}
