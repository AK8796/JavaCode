
public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = new int[] {10,15,24,85,65,91,25,35};
		
		System.out.println("Array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		int max=arr[0];
		
		System.out.println();
		
		System.out.println("Largest Number is : ");
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max);
	}

}
