package example01;

/**
 * 具体观察者类（狗类）
 * @author ★天命之子★
 *
 */
public class Dog implements MyObserver {

	@Override
	public void response() {
		System.out.println("狗跟着叫！");

	}

}
