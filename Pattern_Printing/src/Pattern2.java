import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		
		for(int i=1; i<=n;i++) {
//			for(int j=0;j<=n-i;j++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
