package example01;

/**
 * 抽象类（银行业务输流程类）
 * @author ★天命之子★
 *
 */
public abstract class BankTemplateMethod {

	public void takeNumber() {
		System.out.println("取号排队");
	}
	
	public abstract void transact();
	
	public void evaluate() {
		System.out.println("反馈评分");
	}
	
	public void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
