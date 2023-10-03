
public class EqualMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
//		int b[][]= {{1,5,9},{7,5,3},{4,5,6}};
		
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int row1,col1,row2,col2;
		boolean flag=true;
		
		row1=a.length; //number of rows
		col1=a[0].length;//number of column		
		row2=b.length;
		col2=b[0].length;
		
		/*Since all rows in a 2D array have the same number of columns,you can use the length of any row to determine the number of columns in the entire matrix.*/
		
		System.out.println(row1);
		System.out.println(col1);
		System.out.println(row2);
		System.out.println(col2);
		
		if(row1 != row2 || col1 != col2) {
			System.out.println("Not Equal Matrix");
		}else {
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col1;j++) {
					if(a[i][j]!= b[i][j]) { 
						flag=false;
						break;
				}
			}
		}
		
		if(flag) {
			System.out.println("Equal Matrix");
		}else {
			System.out.println("Not equal matrix");
		}

	}

}
}
