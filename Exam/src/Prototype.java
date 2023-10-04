import java.util.Arrays;
import java.util.Scanner;

public class Prototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int [] arr = {4,8,3,1,7,5,2,5,9};
		int [] arr1=new int[2];
		int n=arr.length;
		int sum=0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i] == arr[i+1]) {
				arr1[0]=arr[i+1];
				arr[i+1]=0;
			}
		}
		for(int i=0;i<n;i++) {
			 sum += arr[i];
		}
		int a = (n*(n+1))/2;
		int diff = a-sum;
		arr1[1]=diff;
		
		for(int i=0; i< arr1.length;i++) {
			System.out.println(arr1[i] +" ");
		}
	}

}
