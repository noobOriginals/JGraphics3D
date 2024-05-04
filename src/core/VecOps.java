package core;

public class VecOps {
	// Adding vectors
	public static Vec3 add(Vec3 v1, Vec3 v2) {
		return new Vec3(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
	}
	
	// Negating vector values
	public static Vec3 negVec(Vec3 vec) {
		return new Vec3(-vec.x, -vec.y, -vec.z);
	}
	
	// Dot product of two vectors
	public static double dot(Vec3 v1, Vec3 v2) {
		return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
	}
	
	// Cross product of two vectors
	public static Vec3 cross(Vec3 v1, Vec3 v2) {
		double newx = v1.y * v2.z - v1.z * v2.y;
		double newy = v1.z * v2.x - v1.x * v2.z;
		double newz = v1.x * v2.y - v1.y * v2.x;
		return new Vec3(newx, newy, newz);
	}
	
	// Matrix-Vector multiplication
	public static Vec4 dot(Mat4 mat, Vec4 vec) {
		double x = mat.items[0][0] * vec.x + mat.items[0][1] * vec.y + mat.items[0][2] * vec.z + mat.items[0][3] * vec.w;
		double y = mat.items[1][0] * vec.x + mat.items[1][1] * vec.y + mat.items[1][2] * vec.z + mat.items[1][3] * vec.w;
		double z = mat.items[2][0] * vec.x + mat.items[2][1] * vec.y + mat.items[2][2] * vec.z + mat.items[2][3] * vec.w;
		double w = mat.items[3][0] * vec.x + mat.items[3][1] * vec.y + mat.items[3][2] * vec.z + mat.items[3][3] * vec.w;
		return new Vec4(x, y, z, w);
	}
	
	// Matrix-Matrix multiplication
	public static Mat4 dot(Mat4 m1, Mat4 m2) {
		Vec4 v0 = new Vec4(m2.items[0][0], m2.items[1][0], m2.items[2][0], m2.items[3][0]);
		Vec4 v1 = new Vec4(m2.items[0][1], m2.items[1][1], m2.items[2][1], m2.items[3][1]);
		Vec4 v2 = new Vec4(m2.items[0][2], m2.items[1][2], m2.items[2][2], m2.items[3][2]);
		Vec4 v3 = new Vec4(m2.items[0][3], m2.items[1][3], m2.items[2][3], m2.items[3][3]);
		v0 = dot(m1, v0);
		v1 = dot(m1, v1);
		v2 = dot(m1, v2);
		v3 = dot(m1, v3);
		Mat4 r = new Mat4(0.0f);
		r.items[0][0] = v0.x;
		r.items[1][0] = v0.y;
		r.items[2][0] = v0.z;
		r.items[3][0] = v0.w;
		r.items[0][1] = v1.x;
		r.items[1][1] = v1.y;
		r.items[2][1] = v1.z;
		r.items[3][1] = v1.w;
		r.items[0][2] = v2.x;
		r.items[1][2] = v2.y;
		r.items[2][2] = v2.z;
		r.items[3][2] = v2.w;
		r.items[0][3] = v3.x;
		r.items[1][3] = v3.y;
		r.items[2][3] = v3.z;
		r.items[3][3] = v3.w;
		return r;
	}
}
