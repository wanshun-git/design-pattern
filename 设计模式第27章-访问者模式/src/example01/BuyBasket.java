package example01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 购物车类
 * @author ★天命之子★
 *
 */
public class BuyBasket {

	private ArrayList list = new ArrayList();
	
	public void accetpt(Visitor visitor) {
		Iterator i = list.iterator();
		
		while(i.hasNext()) {
			((Product) i.next()).accept(visitor);
		}
	}
	
	public void addProduct(Product product) {
		list.add(product);
	}
	
	public void removeProduct(Product product) {
		list.remove(product);
	}
}
