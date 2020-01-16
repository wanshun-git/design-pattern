package example01;

/**
 * 具体元素类（书籍类）
 * @author ★天命之子★
 *
 */
public class Book implements Product {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
