package example01;

/**
 * 具体子类（转账类）
 * @author ★天命之子★
 *
 */
public class Transfer extends BankTemplateMethod {

	@Override
	public void transact() {
		System.out.println("转账");
		
	}

}
