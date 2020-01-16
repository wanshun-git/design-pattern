package example01;

/**
 * 抽象元素类（商品类）
 * @author ★天命之子★
 *
 */
public interface Product {

	void accept(Visitor visitor);
}
