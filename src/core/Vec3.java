package core;

public class Vec3 extends Vec2 {
	// Type
	public final String type = "Vec3";
	
	// New value
	public double z;

	// Full initialization constructor
	public Vec3(double a, double b, double c) {
		super(a, b);
		z = c;
	}
	
	// One value initialization constructor
	public Vec3(double f) {
		super(f);
		z = f;
	}
	
	// Get Vec2 as input for first two values
	public Vec3(Vec2 vec, double c) {
		super(vec.x, vec.y);
		z = c;
	}

	// Get Vec2 as input for last two values
	public Vec3(double a, Vec2 vec) {
		super(a, vec.x);
		z = vec.y;
	}

	// Print vector
	public void print() {
		println("\nPrinting " + type + ":");
		println(x);
		println(y);
		println(z);
		println("Done.\n");
	}
}
