
public class Task15 {

	public static void main(String[] args) {

		float[] array = { -7.13f, 0.2f, 4.9f, 5.1f, 6.34f, -11.12f };

		float x1 = 0;

		for (int index = 0; index <= array.length - 1; index++) {
			if (array[index] > 0) {
				if (array[index] > x1) {
					x1 = array[index];
				}
			} else {
				if ((array[index] * -1) > x1) {
					x1 = array[index] * -1;
				}
			}
		}

		float x2 = 0;
		for (int index = 0; index <= array.length - 1; index++) {
			if (array[index] > 0) {
				if ((array[index] > x2) && (array[index] < x1)) {
					x2 = array[index];
				}
			} else {
				if ((array[index] * -1 > x2) && (array[index] * -1 < x1)) {
					x2 = array[index] * -1;
				}
			}

		}

		float x3 = 0;
		for (int index = 0; index <= array.length - 1; index++) {
			if (array[index] > 0) {
				if ((array[index] > x3) && (array[index] < x2)) {
					x3 = array[index];
				}
			} else {
				if ((array[index] * -1 > x3) && (array[index] * -1 < x2)) {
					x3 = array[index] * -1;
				}
			}

		}

		System.out.print(x1 + "; " + x2 + "; " + x3);
	}

}
