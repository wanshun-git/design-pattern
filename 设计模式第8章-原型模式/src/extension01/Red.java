package extension01;

/**
 * 具体原型类Red
 * @author ★天命之子★
 *
 */
public class Red implements MyColor {

	public Object clone() {
		Red r = null;
		try {
			r = (Red) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("克隆失败!");
		}
		return r;
	}
	
	@Override
	public void display() {
		System.out.println("This is Red!"); 
	}

}
