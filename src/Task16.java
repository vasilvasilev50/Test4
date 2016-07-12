
public class Task16 {

	public static void main(String[] args) {
		
		float [] arr = {-1.12f, -2.43f, 3.1f, 4.2f, 0f, 6.4f, - 7.5f, 8.6f, 9.1f, -4f};
		
		for (int index = 0; index <= arr.length-1; index++) {
			System.out.print(arr[index]+", ");
		}
		
		System.out.println();
		for (int index = 0; index <= arr.length-1; index++) {
			if (arr[index]<-0.231f) {
				arr[index] = (index+1)*(index+1)+41.25f;
			} else {
				arr[index] *= (index+1);
			}
			System.out.print(arr[index]+", ");
		}
		

	}

}
