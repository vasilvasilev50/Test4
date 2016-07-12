
public class Task17 {

	public static void main(String[] args) {

		int[] arr = {1, 3, 2, 4, 3, 7, 4, 11, 5, 15};

		boolean zigzagUpwards = true;

		for (int index = 0; index <= arr.length - 3; index += 2) {
			if ((arr[index] < arr[index + 1]) && (arr[index + 1] > arr[index + 2])) {
				zigzagUpwards = true;
			} else {
				zigzagUpwards = false;
				break;
			}
		}
		if (zigzagUpwards) {
			System.out.println("Изпълнява изискванията за зигзагообразна нагоре редица!");
		} else {
			System.out.println("Не изпълнява изискванията за зигзагообразна нагоре редица!");
		}
	}

}
