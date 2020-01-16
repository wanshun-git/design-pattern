package example01;

/**
 * 具体元素类（苹果类）
 * @author ★天命之子★
 *
 */
public class Apple implements Product {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
