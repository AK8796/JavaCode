
public class EvenPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {1,2,3,4,5,6};
		
		System.out.println("Array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("Array elements at even position :");
		for(int i=1; i<arr.length; i=i+2) {
			System.out.println(arr[i]);
		}

	}

}
