package Iterater;

import java.util.ArrayList;
import java.util.Iterator;

public class GeekyStoreiterator implements Iterator  {

	ArrayList<Product> catalog;
	int posotion = 0;
	
	public GeekyStoreiterator(ArrayList<Product> catalog) {
		this.catalog = catalog;
	}

	public boolean hasNext() {
		
		// TODO Auto-generated method stub
		if(posotion >= catalog.size() || catalog.get(posotion) == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Product product = catalog.get(posotion);
		posotion ++;
		return product;
	}

	
	
}
