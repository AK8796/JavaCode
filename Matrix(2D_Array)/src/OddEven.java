
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int rows = arr.length;
		int cols = arr[0].length;
		int countEven=0, countOdd=0;

		if (rows != cols) {
			System.out.println("Matrix should be square");
		} else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					if(arr[i][j] % 2 == 0) { 
						countEven++;
					}else {
						countOdd++;
					}
				}
			}
			System.out.println("Count of odd number "+countOdd);
			System.out.println("Count of even number "+countEven);
		}

	}

}
