
public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][]= {{1,2,3},{4,5,6},{7,8,9},{1,5,9}};
		
		int rows= arr.length;
		int cols=arr[0].length;
		
		//Declare array t with reverse dimensions
		int trans [][]= new int[cols][rows];
		
		for(int i=0; i<cols;i++) {
			for(int j=0; j<rows; j++) {
				trans[i][j]= arr[j][i];
			}
		}
		System.out.println("Transpose Array : ");
		for(int i=0;i<cols;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(trans[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
