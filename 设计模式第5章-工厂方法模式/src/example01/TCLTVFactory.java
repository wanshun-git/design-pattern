package example01;

public class TCLTVFactory implements TVFactory {

	@Override
	public TV produceTV() {
		System.out.println("TCL电视机工厂生产TCL电视机.");
		return new TCLTV();
	}

}
