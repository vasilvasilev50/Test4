
public class Task18 {

	public static void main(String[] args) {
		
		int [] arr1 = {18,19,32,1,3, 4, 5, 6, 7, 8};
		int [] arr2 = {1, 2, 3,4,5,16,17,18,27,11};
		
		int size3 = (arr1.length<arr2.length)?arr1.length:arr2.length;
		int [] arr3 = new int[size3];
		
		for (int index = 0; index<=size3-1; index++) {
			if (arr1[index]>arr2[index]) {
				arr3[index] = arr1[index];
			} else {
				arr3[index] = arr2[index];
			}
			System.out.print(arr3[index]+", ");
		}
		
	}

}
