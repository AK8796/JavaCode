
public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = {{1,0,0},{0,1,0},{0,0,1}};
		 int rows=arr.length;
		 int cols=arr[0].length;
		 
		 boolean flag=true;
		 for(int i=0;i<rows;i++) {
			 for(int j=0; j<cols;j++) {
				 if(i==j && arr[i][j]!=1) {
					 flag=false;
					 break;
				 }else if(i!=j && arr[i][j]!=0 ) {
					 flag=false;
					 break;
				 }
			 }
		 }
		 if(flag) {
			 System.out.println("Identity Matrix");
		 }else{
			 System.out.println("Not Indetity Matrix");
		 }
	}

}
