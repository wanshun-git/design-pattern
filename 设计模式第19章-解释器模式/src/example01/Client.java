package example01;

/**
 * 客户端测试类
 * @author ★天命之子★
 *
 */
public class Client {

	public static void main(String[] args) {
		String statement = "3 * 4 / 2 % 4";
		
		Calculator calculator = new Calculator();
		
		calculator.build(statement);
		
		int result = calculator.compute();
		
		System.out.println(statement + " = " + result);
	}
}
