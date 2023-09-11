
public class RemoveDuplicate {

	private static int removeDuplicateElements(int[] arr, int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1) {
			return n;
		}
		
		int temp[]=new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
			}
		}
		temp[j++]=arr[n-1];
		
		//changing original array
		for(int i=0;i<j;i++) {
			arr[i]=temp[i];
		}
		return j;
	}
	
    public static int removeDuplicateElements1(int arr1[], int n){  
        if (n==0 || n==1){  
            return n;  
        }    
        int j = 0;//for next element  
        for (int i=0; i < n-1; i++){  
            if (arr1[i] != arr1[i+1]){  
                arr1[j++] = arr1[i];  
            }  
        }  
        arr1[j++] = arr1[n-1];  
        return j;  
    }  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [] {10,20,20,30,40,40,50,50};//sorted array
		int n=arr.length;
		
		int length= removeDuplicateElements(arr , n);
		for(int i=0; i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		int arr1[] = new int [] {10,20,20,30,40,40,50,50};
		int m=arr.length;
		
		int length1= removeDuplicateElements1(arr1 , m);
		for(int i=0; i<length1;i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}

/*
 For unsorted array use Arrays.sort(arr);//sorting array  
 */
