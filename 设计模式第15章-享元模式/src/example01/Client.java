package example01;

public class Client {

	public static void main(String[] args) {
		NetworkDevice nd1,nd2,nd3,nd4,nd5;
		DeviceFactory df = new DeviceFactory();
		
		nd1 = df.getNetWorkDevice("cisco");
		nd1.use();
		
		nd2 = df.getNetWorkDevice("cisco");
		nd2.use();
		
		nd3 = df.getNetWorkDevice("cisco");
		nd3.use();
		
		nd4 = df.getNetWorkDevice("tp");
		nd4.use();
		
		nd5 = df.getNetWorkDevice("tp");
		nd5.use();
		
		System.out.println("Total Device:" + df.getTotalDevice());
		System.out.println("Total Terminal:" + df.getTotalTerminal());
	}
}
