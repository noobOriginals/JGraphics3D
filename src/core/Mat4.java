package core;

public class Mat4 {
	// Type
	public final String type = "Mat4";
	
	// Array for values inside matrix
	public double items[][] = new double[4][4];
	
	// Constructor for initializing the diagonal of the matrix
	public Mat4(double f) {
		items[0][0] = f;
		items[1][1] = f;
		items[2][2] = f;
		items[3][3] = f;
		items[0][1] = 0.0f;
		items[0][2] = 0.0f;
		items[1][0] = 0.0f;
		items[1][2] = 0.0f;
		items[2][0] = 0.0f;
		items[2][1] = 0.0f;
		items[0][3] = 0.0f;
		items[1][3] = 0.0f;
		items[2][3] = 0.0f;
		items[3][0] = 0.0f;
		items[3][1] = 0.0f;
		items[3][2] = 0.0f;
	}
	
	// Constructor for casting a Mat3 into a Mat4
	public Mat4(Mat3 mat, double f) {
		for (int i = 0; i < mat.items.length; i++) {
			for (int j = 0; j < mat.items[i].length; j++) {
				items[i][j] = mat.items[i][j];
			}
		}
		items[3][3] = f;
		items[0][3] = 0.0f;
		items[1][3] = 0.0f;
		items[2][3] = 0.0f;
		items[3][0] = 0.0f;
		items[3][1] = 0.0f;
		items[3][2] = 0.0f;
	}
	
	// Print matrix method
	public void print() {
		println("\nPrinting " + type + ":");
		printlnRow(items[0]);
		printlnRow(items[1]);
		printlnRow(items[2]);
		printlnRow(items[3]);
		println("Done.\n");
	}
	
	// Private methods for readable code above
	private void println(String s) {
		System.out.println(s);
	}
	private void printlnRow(double f[]) {
		String s = "";
		for (double nr : f) {
			s += nr + " ";
		}
		System.out.println(s);
	}
}
