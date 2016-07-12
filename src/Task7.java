import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int array[] = new int[sc.nextInt()];
		for (int index = 0; index <= array.length - 1; index++) {
			array[index] = sc.nextInt();
		}

		int[] array2 = new int[array.length];
		for (int index = 0; index <= array.length - 1; index++) {
			if ((index == 0)||(index == array.length-1)) {
				array2[index] = array[index];
			} else {
				array2[index] = array[index-1]+array[index+1];
			}
		}
		
		for (int index = 0; index <= array.length - 1; index++) {
			System.out.print(array2[index]+ ", ");
		}

	}

}
