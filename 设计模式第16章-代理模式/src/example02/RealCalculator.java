package example02;

public class RealCalculator implements Calculator {

	@Override
	public double add(double x, double y) {
		return x + y;
	}

	@Override
	public double sub(double x, double y) {
		return x - y;
	}

	@Override
	public double mul(double x, double y) {
		return x * y;
	}

	@Override
	public double div(double x, double y) {
		return x / y;
	}

}
