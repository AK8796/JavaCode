
public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr [] = new int[] {10,15,24,85,5,65,91,25,35};
		
		System.out.println("Array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Smallest Element is : " +small);

	}

}
