
public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr [] = new int[] {9,8,5,1,6};
		
		System.out.println("Original array : ");
		for(int i=0; i<arr.length;i++) {
			System.out.print( arr[i]);
		}
		
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("Array in ascending order :");
		for(int i=0; i<arr.length;i++) {
			System.out.print( arr[i]);
		}

	}

}
