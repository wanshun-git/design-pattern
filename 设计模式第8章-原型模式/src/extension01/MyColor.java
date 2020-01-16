package extension01;

/**
 * 抽象原型类
 * @author ★天命之子★
 *
 */
public interface MyColor extends Cloneable {

	Object clone();
	void display();
}
