
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int [] {1,2,3,5,1,3,3,9,1,2};
		int arr1[]=new int[arr.length];
		
		System.out.println("Duplicate elements are: ");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] == -1) {
					break;
				}
				else if (arr[i] == arr[j]){
					System.out.println(arr[i]);
					arr[j]=-1;
					break;
				}
			}
		}
		System.out.println("Array :");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					arr1[j]=-1;
//			}
//			if(arr1[i]!=-1) {
//				arr1[i]=arr[i];
//			}
//		}
//			
		

	}

}

