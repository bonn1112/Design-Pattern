package Iterater;

import java.util.Iterator;

public class Seller {
	
	catalog geekyStoreCatalog;
	catalog devStoreCatalog;

	public Seller(catalog geekyStoreCatalog,catalog devStoreCatalog ) {
		this.geekyStoreCatalog = geekyStoreCatalog;
		this.devStoreCatalog = devStoreCatalog;
	}

	public void printCatalog() {
		Iterator geekyStoreiterator = geekyStoreCatalog.createIterator();
		Iterator devStoreiterator = devStoreCatalog.createIterator();
		System.out.println("Printing Catalog");
		printCatalog(geekyStoreiterator);
		printCatalog(devStoreiterator);
	}
	
	private void printCatalog(Iterator iterator) {
		while(iterator.hasNext()) {
			Product product = (Product) iterator.next();
			System.out.println(product.getName()+" ");
			System.out.println(product.getPrice() + " ");
			System.out.println(product.getDescription());
		}
	}
	
	/*
	 * private void printCatalog(GeekyStoreiterator iterator) {
	 * while(iterator.hasnext()) { Product product = (Product) iterator.next();
	 * System.out.println(product.getName()+" ");
	 * System.out.println(product.getPrice() + " ");
	 * System.out.println(product.getDescription()); } }
	 */

}
