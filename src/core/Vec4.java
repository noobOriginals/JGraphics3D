package core;

public class Vec4 extends Vec3 {
	// Type
	public final String type = "Vec4";
	
	// New value
	public double w;

	// Full initialization constructor
	public Vec4(double a, double b, double c, double d) {
		super(a, b, c);
		w = d;
	}
	
	// One value initialization constructor
	public Vec4(double f) {
		super(f);
		w = f;
	}
	
	// Get Vec3 as input for first three values
	public Vec4(Vec3 vec, double d) {
		super(vec.x, vec.y, vec.z);
		w = d;
	}
	
	// Get Vec3 as input for last three values
	public Vec4(double a, Vec3 vec) {
		super(a, vec.x, vec.y);
		w = vec.z;
	}
	
	// Get Vec2 as input for first two values
	public Vec4(Vec2 vec, double c, double d) {
		super(vec.x, vec.y, c);
		w = d;
	}
	
	// Get Vec2 as input for y and z values
	public Vec4(double a, Vec2 vec, double d) {
		super(a, vec.x, vec.y);
		w = d;
	}
	
	// Get vec2 as input for last two values
	public Vec4(double a, double b, Vec2 vec) {
		super(a, b, vec.x);
		w = vec.y;
	}
	
	// Get two Vec2s as input for x, y and z, w values
	public Vec4(Vec2 v1, Vec2 v2) {
		super(v1.x, v1.y, v2.x);
		w = v2.y;
	}

	// Print vector
	public void print() {
		println("\nPrinting " + type + ":");
		println(x);
		println(y);
		println(z);
		println(w);
		println("Done.\n");
	}
}
