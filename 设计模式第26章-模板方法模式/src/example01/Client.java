package example01;

public class Client {

	public static void main(String[] args) {
		BankTemplateMethod bank;
		
		bank = (BankTemplateMethod) XMLUtil.getBean();
		
		bank.process();
		System.out.println("--------------------");
	}
}
