package Iterater;

public class DevStoreCatalog {
	
	private static final int MAX_ITEMS = 4;
	private int numberOfProducts = 0;
	Product[] catalog;
	
	public DevStoreCatalog() {
		catalog = new Product[MAX_ITEMS]; 
		
		additem("C++ is not dead", "T-shirt", 39.90);
		additem("Java Rocks", "Silky mouse-pad", 19.9);
		additem("Java Design Pattern", "Book - A moust!", 139.9);
		additem("Web Develop book", "The best web development", 144.9);
	}

	public void additem(String name, String description, double price) {
		Product product = new Product(name, description, price);
		
		if (numberOfProducts >= MAX_ITEMS) {
			System.out.println("catalog is full you cannot add products");
		}
		else {
			catalog[numberOfProducts] = product;
			numberOfProducts = numberOfProducts + 1;
		}
	}
	
//	public Product[] getCatalog() {
//		return catalog;
//	}
	
	public DevStoreiterator createDevStoreiterator() {	
		return new DevStoreiterator(catalog);
		
	}
}
