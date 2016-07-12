import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] x = new int[sc.nextInt()];

		// for (int index = 0; index<=x.length-1; index++) {
		// x[index] = sc.nextInt();
		// }
		//
		// int [] y = new int[x.length];
		// int a = 0;
		// for (int index = 0; index<=x.length-1; index++) {
		// y[index] = x[(x.length-1)-a];
		// a++;
		// System.out.println(y[index]);
		// }

		for (int index = x.length-1; index >= 0; index--) {
			x[index] = sc.nextInt();
		}

		for (int index = 0; index <= x.length - 1; index++) {
			System.out.println(x[index]);
		}

	}

}
