
public class Task2 {

	public static void main(String[] args) {

		int[] arrayA = { 3, 5, 7, 9, 11 };

		int[] arrayB = new int[arrayA.length * 2];
		
		int x = 1;

		for (int index = 0; index <= arrayB.length - 1; index++) {
			if (index < arrayA.length) {
				arrayB[index] = arrayA[index];
			} else {
				arrayB[index] = arrayA[index-x];
				x += 2;
			}
		}

		for (int index = 0; index <= arrayB.length - 1; index++) {
			System.out.print(arrayB[index]+", ");
		}

	}

}
