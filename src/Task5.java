
public class Task5 {

	public static void main(String[] args) {
		
		int [] array = new int[10];
		
		for (int index = 0; index < 10; index++) {
			array[index] = index*3;
		}
		
		for (int index = 0; index < 10; index++) {
			System.out.println(array[index]);
		}
	}

}
