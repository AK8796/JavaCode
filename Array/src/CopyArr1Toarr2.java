
public class CopyArr1Toarr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1 [] = new int [] {1,2,3,4,5};
		
		int arr2 [] = new int [arr1.length];
		
		System.out.println("Original array : ");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]);
		}
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println();
		System.out.println("Copied array : ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
		}

}
}