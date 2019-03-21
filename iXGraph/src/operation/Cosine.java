package operation;

import iX.Calculate;

public class Cosine extends Calculate{

	private final double a;
	private final double b;
	private final double c;
	
	public Cosine() {
		this(1, 1, 0);
	}
	
	public Cosine(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calc(double x) {
		return (a * Math.cos(b * x) + c);
	}

}
