import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[sc.nextInt()];

		for (int index = 0; index <= array.length - 1; index++) {
			array[index] = sc.nextInt();
		}

		boolean mirror = true;
		int x = 0;
		if (array.length > 1) {
			for (int index = 0; index <= (array.length-1)/2; index++) {
				if (array[index] == array[(array.length - 1) - x]) {	
					mirror = true;
					x++;
				} else {
					mirror = false;
					break;
				}
			}
		} 
		
		if (mirror) {
			System.out.println("Masivat e ogledalen");
		} else {
			System.out.println("Masivat ne e ogledalen");
		}

	}

}
