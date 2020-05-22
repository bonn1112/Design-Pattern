package Iterater;

import java.util.ArrayList;
import java.util.Iterator;

public class DevStoreiterator implements Iterator{

	Product[] catalog;
	int position = 0;
	
	public DevStoreiterator(Product[] catalog) {
		this.catalog = catalog;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= catalog.length || catalog[position] == null) {
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Product product = catalog[position];
		position++;
		return product;
	}
	
	@Override
	public void remove() {
		// TODO Auto-generated method stub
		if (position <= 0) {
			throw new IllegalStateException("Cannot remove item until you've done at least one next()");
		}
		if (catalog[position-1] == null) {
			for (int i = 0; i < catalog.length-1; i++) {
				catalog[i] = catalog[i+1];
			}
			catalog[catalog.length-1] = null;
		}
	}

}
