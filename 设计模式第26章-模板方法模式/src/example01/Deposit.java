package example01;

/**
 * 具体子类（存款类）
 * @author ★天命之子★
 *
 */
public class Deposit extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("存款");
	}

}
