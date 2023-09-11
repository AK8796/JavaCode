
public class UpperTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};
		int rows=arr.length; // arrays of array
		int cols=arr[0].length;
		
		if(rows != cols) {
			System.out.println("Matrix should be square");
		}else {
			for(int i=0; i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(i>j) {
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
