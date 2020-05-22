package Iterater;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DevStoreCatalog devStoreCatalog = new DevStoreCatalog();
				
		GeekyStoreCatalog geekyStoreCatalog = new GeekyStoreCatalog();
	   		
	    Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
	    seller.printCatalog();
	    
		/*
		 * for(int i=0; i< devCatalog.length; i++) { Product product = devCatalog[i];
		 * System.out.print(product.getName() + " ");
		 * System.out.print(product.getDescription() + " ");
		 * System.out.println(product.getPrice()); }
		 * 
		 * for(int i=0; i< geekCatalog.size(); i++) { Product product = (Product)
		 * geekCatalog.get(i); System.out.print(product.getName() + " ");
		 * System.out.print(product.getDescription() + " ");
		 * System.out.println(product.getPrice()); }
		 */
	}

}
