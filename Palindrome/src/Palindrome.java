import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int sum=0;
		
		int temp = n;
		while(n>0) {
			int r = n%10;
			sum=(sum * 10)+r;
			n=n/10;
		}
		
		if(temp == sum)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a palindrome number");

	}

}
