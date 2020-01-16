package example01;

/**
 * 具体子类（取款类）
 * @author ★天命之子★
 *
 */
public class Withdraw extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("取款");
		
	}

}
