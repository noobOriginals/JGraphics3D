package core;

public class Vec2 {
	// Type
	public final String type = "Vec2";
	
	// Values
	public double x, y;
	
	// Full initialization constructor
	public Vec2(double a, double b) {
		x = a;
		y = b;
	}
	
	// One value initialization constructor
	public Vec2(double f) {
		x = y = f;
	}
	
	// Print vector
	public void print() {
		println("\nPrinting " + type + ":");
		println(x);
		println(y);
		println("Done.\n");
	}
	
	// Methods for cleaner code
	protected void println(String s) {
		System.out.println(s);
	}
	protected void println(double f) {
		System.out.println(f);
	}
}