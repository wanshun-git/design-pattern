package example02;

public class ProxyCaculator implements Calculator {

	RealCalculator real;
	
	public void init() {
		this.real = new RealCalculator();
	}
	
	@Override
	public double add(double x, double y) {
		return real.add(x, y);
	}

	@Override
	public double sub(double x, double y) {
		return real.sub(x, y);
	}

	@Override
	public double mul(double x, double y) {
		return real.mul(x, y);
	}

	@Override
	public double div(double x, double y) {
		return real.div(x, y);
	}

}
