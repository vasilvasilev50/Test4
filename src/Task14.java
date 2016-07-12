
public class Task14 {

	public static void main(String[] args) {

		float[] x = { 7.1f, 8.5f, 0.2f, 3.7f, 0.99f, 1.4f, -3.5f, -110f, 212f, 341f, 1.2f };

		int sizeY = 0;
		
		for (int index = 0; index <= x.length - 1; index++) {
			if ((x[index] >= -2.99) && (x[index] <= 2.99)) {
				sizeY++;
			}
		}
		
		float[] y = new float[sizeY];
		int indexY = 0;
		
		for (int index = 0; index <= x.length - 1; index++) {
			if ((x[index] >= -2.99) && (x[index] <= 2.99)) {
				y[indexY] = x[index];
				indexY++;
			}
		}

		for (int index = 0; index <= y.length - 1; index++) {
			System.out.print(y[index] + ", ");
		}
		
		

	}

}
