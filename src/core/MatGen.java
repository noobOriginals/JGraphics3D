package core;

import static core.VecOps.*;

public class MatGen {
	// Translation matrix generator function
	public static Mat4 translate(Mat4 m, Vec3 t) {
		// Translation matrix
		Mat4 r = new Mat4(1.0f);
		
		// Assign translation values
		r.items[0][3] = t.x;
		r.items[1][3] = t.y;
		r.items[2][3] = t.z;
		
		// Return the modified matrix
		return dot(m, r);
	}

	// Scaling matrix generator function
	public static Mat4 scale(Mat4 m, Vec3 s) {
		// Scaling Matrix
		Mat4 r = new Mat4(1.0f);
		
		// Assign scale values
		r.items[0][0] = s.x;
		r.items[1][1] = s.y;
		r.items[2][2] = s.z;
		
		// Return modified matrix
		return dot(m, r);
	}

	// Rotation matrix generator function
	public static Mat4 rotate(Mat4 m, double angle, Vec3 rt) {
		// Rotation matrices
		Mat4 rx = new Mat4(1.0f);
		Mat4 ry = new Mat4(1.0f);
		Mat4 rz = new Mat4(1.0f);
		
		// Assign rotation on x values
		rx.items[1][1] = cos(angle * rt.x);
		rx.items[1][2] = -sin(angle * rt.x);
		rx.items[2][1] = sin(angle * rt.x);
		rx.items[2][2] = cos(angle * rt.x);
		
		// Assign rotation on y values
		ry.items[0][0] = cos(angle * rt.y);
		ry.items[2][0] = -sin(angle * rt.y);
		ry.items[0][2] = sin(angle * rt.y);
		ry.items[2][2] = cos(angle * rt.y);
		
		// Assign rotation on z values
		rz.items[0][0] = cos(angle * rt.z);
		rz.items[0][1] = -sin(angle * rt.z);
		rz.items[1][0] = sin(angle * rt.z);
		rz.items[1][1] = cos(angle * rt.z);
		
		// Return modified matrix
		return dot(dot(rz, dot(ry, rx)), m);
	}
	
	
	// Private methods for readable code above
	private static final int PRECISION = 1_000_000_000;
	public static double sin(double degrees) {
		return ((int)(Math.sinh(degrees) * PRECISION)) / PRECISION;
	}
	public static double cos(double degrees) {
		return ((int)(Math.cosh(degrees) * PRECISION)) / PRECISION;
	}
	public static double tan(double degrees) {
		return ((int)(Math.tanh(degrees) * PRECISION)) / PRECISION;
	}
}
