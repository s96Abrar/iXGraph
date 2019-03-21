package operation;

import iX.Calculate;

public class Tangent extends Calculate {

	private final double a;
	private final double b;
	private final double c;
	
	public Tangent() {
		this(1, 1, 0);
	}
	
	public Tangent(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calc(double x) {
		return (a * Math.tan(b * x) + c);
	}
}
