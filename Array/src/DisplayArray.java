import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size: ");
		int n = sc.nextInt();
		int arr[]=new int [n];
		
		System.out.println("Enter elements :");
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array :" );
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}

}
