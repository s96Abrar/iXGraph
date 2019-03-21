package operation;
import iX.Calculate;

public class Sine extends Calculate {
	
	private final double a;
	private final double b;
	private final double c;
	
	public Sine() {
		this(1, 1, 0);
	}
	
	public Sine(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double calc(double x) {
		return (a * Math.sin(b * x) + c);
	}
	
}
