
public class Task10 {

	public static void main(String[] args) {

		int[] x = { -4, -46, -20, 6, 44, 5, -35 };

		int sum = 0;

		for (int index = 0; index <= x.length - 1; index++) {
			sum += x[index];
		}
		float averageValue = sum/x.length;
		int closest = x[0];
		
		for (int index = 0; index <= x.length - 1; index++) {
			if (x[index] == averageValue) {
				closest = x[index];
				break;
			} else {
				if (x[index]>0) {
					if (closest>0) {
						if ((x[index]-averageValue)<(closest-averageValue)) {
							closest=x[index];
						}
					} else {
						if ((x[index]-averageValue)<((closest-averageValue)*-1)) {
							closest=x[index];
						}
					}
				} else {
					if (closest<0){
						if ((x[index]-averageValue)>(closest-averageValue)){
							closest=x[index];
						}
					} else {
						if ((x[index]-averageValue)>((closest-averageValue)*-1)) {
							closest=x[index];
						}
					}
				}
				
			}
		}
		System.out.println(averageValue);
		System.out.println(closest);
	}

}
