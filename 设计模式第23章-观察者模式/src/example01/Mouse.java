package example01;

/**
 * 具体观察者类（老鼠类）
 * @author ★天命之子★
 *
 */
public class Mouse implements MyObserver {

	@Override
	public void response() {
		System.out.println("老鼠努力逃跑！");
	}

}
