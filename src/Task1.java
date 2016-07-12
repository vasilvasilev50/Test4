import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();

		
		if (size > 0) {
			int x[] = new int[size];

			for (int index = 0; index <= x.length - 1; index++) {
				System.out.println("Enter array index "+(index+1));
				x[index] = sc.nextInt();
			}
			
			int minMultipleOf3=0;
			
			for (int index = 0; index <= x.length - 1; index++) {
				if (x[index] % 3 == 0) {
					minMultipleOf3 = x[index];
				}
			}
			for (int index = 0; index <= x.length - 1; index++) {
				if ((x[index] % 3 == 0)&&(x[index]<minMultipleOf3)) {
					minMultipleOf3 = x[index];
				}
			}
			
			if (minMultipleOf3!=0) {
				System.out.println("Nai malkoto chislo kratno na 3 e " + minMultipleOf3);
			} else {
				System.out.println("Nqma chislo kratno na 3");
			}
		}

	}

}
