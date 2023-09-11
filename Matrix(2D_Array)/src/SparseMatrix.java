
public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Sparse Matrix => To check whether the given matrix is the sparse matrix or not, we first count the number of zero 
		  elements present in the matrix. Then calculate the size of the matrix. For the matrix to be sparse, 
		  count of zero elements present in an array must be greater than size/2.*/
		
		int arr[][] = { { 0, 2, 0 }, { 4, 0, 5 }, { 0, 8, 1 } };
		int rows = arr.length;
		int cols = arr[0].length;
		int count = 0;
		int size = rows * cols;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (arr[i][j] == 0) {
					count++;
				}
			}
		}
		if(count > size/2) {
			System.out.println("Sparse Matrix");
		}else {
			System.out.println("Not Sparse Matrix");
		}

	}

}
