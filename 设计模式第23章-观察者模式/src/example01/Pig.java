package example01;

/**
 * 具体观察者类（猪类）
 * @author ★天命之子★
 *
 */
public class Pig implements MyObserver {

	@Override
	public void response() {
		System.out.println("猪没有反应！");

	}

}
