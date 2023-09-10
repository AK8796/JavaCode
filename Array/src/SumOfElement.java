
public class SumOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr [] = new int[] {10,20,30,40,50};
			
			System.out.println("Array : ");
			for(int i=0; i<arr.length;i++) {
				System.out.println(arr[i]);
			}
			
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum = sum + arr[i];
			}
			System.out.println("um of all element in array is : " +sum);

	}

}
