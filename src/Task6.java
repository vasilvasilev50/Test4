import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array 1 size");
		int[] array1 = new int[sc.nextInt()];
		System.out.println("Enter array 1 items");
		for (int index = 0; index <= array1.length-1; index++) {
			array1[index] = sc.nextInt();
		}

		System.out.println("Enter array 2 size");
		int[] array2 = new int[sc.nextInt()];
		System.out.println("Enter array 2 items");
		for (int index = 0; index <= array2.length - 1; index++) {
			array2[index] = sc.nextInt();
		}

		if (array1.length == array2.length) {
			System.out.println("Arrays have same length");
			for (int index = 0; index <= array1.length - 1; index++) {
				if (array1[index] != array2[index]) {
					System.out.println("Arrays are not the same");
					break;	
				} else {
					if (index == array1.length-1) {
						System.out.println("Arrays are the same");
					}
				}
			}
			
		}

	}

}
