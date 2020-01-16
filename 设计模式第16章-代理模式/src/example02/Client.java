package example02;

public class Client {

	public static void main(String[] args) {
		ProxyCaculator calculator = (ProxyCaculator) XMLUtil.getBean();
		calculator.init();
		System.out.println(calculator.add(1.2, 3.4));
		System.out.println(calculator.sub(1.2, 3.4));
		System.out.println(calculator.mul(1.2, 3.4));
		System.out.println(calculator.div(1.2, 3.4));
	}

}
