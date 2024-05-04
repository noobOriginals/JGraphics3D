package core;

public class Mat3 {
	// Type
	public final String type = "Mat3";

	// Array for values inside matrix
	public double items[][] = new double[3][3];

	// Constructor for initializing the diagonal of the matrix
	public Mat3(float f) {
		items[0][0] = f;
		items[1][1] = f;
		items[2][2] = f;
		items[0][1] = 0.0f;
		items[0][2] = 0.0f;
		items[1][0] = 0.0f;
		items[1][2] = 0.0f;
		items[2][0] = 0.0f;
		items[2][1] = 0.0f;
	}

	// Print matrix method
	public void print() {
		println("\nPrinting " + type + ":");
		printlnRow(items[0]);
		printlnRow(items[1]);
		printlnRow(items[2]);
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
