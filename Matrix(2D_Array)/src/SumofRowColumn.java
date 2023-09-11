
public class SumofRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr= {{1,2,3,},{4,5,6},{7,8,9}};
		
		int rows=arr.length;
		int cols=arr[0].length;
		
		for(int i=0;i<rows;i++) {
			int sumRow=0;
			for(int j=0;j<cols;j++) {
				sumRow=sumRow + arr[i][j];
			}
			System.out.println(" Sum of " +(i+1)+" row "+sumRow);
		}
		
		for(int i=0; i<cols;i++) {
			int sumCols=0;
			for(int j=0; j<rows;j++) {
				sumCols=sumCols+ arr[j][i];
			}
			System.out.println(" Sum of " +(i+1)+" cols "+sumCols);
		}
	}

}
