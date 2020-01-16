package example01;

/**
 * 具体目标类（猫类）
 * @author ★天命之子★
 *
 */
public class Cat extends MySubject {

	@Override
	public void cry() {
		System.out.println("猫叫！");
		System.out.println("--------------------");
		
		for (Object obs : observers) {
			((MyObserver) obs).response();
		}
	}

}
