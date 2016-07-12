
public class Task11 {

	public static void main(String[] args) {
		
		int []x = {-23,-55,17,75,56,105,134};

		for (int index=0; index<=x.length-1; index++) {
			if ((x[index]%5==0)&&(x[index]>5)) {
				System.out.print(x[index]+", ");
			}
		}
	}

}
