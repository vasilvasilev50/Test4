import java.util.Arrays;

public class Task8 {

	public static void main(String[] args) {

		int[] arr = { 1, 5, 5, 8, 9, 9, 9, 9, 2, 2, 2, 2, 2, 2, 5, 6, 3, 11, 11, 11 };
		
		int count = 1;
		int maxCount = 0;
		int startIndex = 0;
		for (int index = 1; index<=arr.length-1; index++) {
			if (arr[index]==arr[index-1]) {
				count++;
				if (count > maxCount) {
					maxCount = count;
					startIndex = index - maxCount + 1;
				}
			} else {
				count = 1;
			}
		}
//		System.out.println(startIndex);
//		System.out.println(maxCount);
		
		System.out.print("Най-дългата редица от еднакви поредни елементи е: ");
		for (int index = startIndex; index <= startIndex+maxCount-1; index++) {
			System.out.print(arr[index]+", ");
		}
		
	}

}
