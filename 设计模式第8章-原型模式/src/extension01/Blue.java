package extension01;

/**
 * 具体原型类Blue
 * @author ★天命之子★
 *
 */
public class Blue implements MyColor {

	public Object clone() {
		Blue b = null;
		try {
			b = (Blue) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("克隆失败!");
		}
		return b;
	}
	
	@Override
	public void display() {
		System.out.println("this is Blue!");
	}

}
