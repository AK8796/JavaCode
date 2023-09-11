
public class Print_Odd_and_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {1,2,4,3,4,5,6};
		
		System.out.println("Odd elements : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nEven elements : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 ==0) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
