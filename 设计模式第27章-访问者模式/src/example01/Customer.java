package example01;

/**
 * 具体访问者类（顾客类）
 * @author ★天命之子★
 *
 */
public class Customer extends Visitor {
	
	@Override
	public void visit(Apple apple) {
		System.out.println("顾客" + name + "选苹果。");
	}

	@Override
	public void visit(Book book) {
		System.out.println("顾客" + name + "买书。");
	}

}
