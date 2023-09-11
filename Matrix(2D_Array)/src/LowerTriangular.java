
public class LowerTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] [] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr[] [] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		int rows= arr.length;
		int cols= arr[0].length;
		
		if(rows != cols) {
			System.out.println("Matrix should be a square matrix");
		}else {
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(j>i) {
						System.out.print("0"+" ");
					}else {
						System.out.print(arr[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
	}

}
