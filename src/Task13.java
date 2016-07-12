import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		long y = 1L;
		long binary = 0L;
		for (long x = number; x != 0; x/=2, y*=10) {
			binary += (x%2)*y;
		}
		System.out.println("Number in binary = "+binary);
		
		int a = 10;
		int size = 0;
		
		for (int b = number; b!=0; b/=a) {
			size++;
		}
		
		int [] array = new int[size];
		
		int b = 1;
		for (int index = size-1; index>=0; index--, b*=10) {
			array[index] = (number/b)%10;
		}
		
		for (int index = 0; index<=size-1; index++) {
			int y1 = 1;
			int binary1 = 0;
			for (int x = array[index]; x != 0; x/=2, y1*=10) {
				binary1 += (x%2)*y1;
			}
			System.out.println("digits of the number in binary = "+binary1);
		}

	}

}
