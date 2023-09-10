import java.util.Scanner;

public class Armstrong {
	

	private static boolean isArmstrong(int n) {
		// TODO Auto-generated method stub
		int temp=n, digits=0;
		while(temp>0) {
			temp=temp/10;
			digits++;
		}
		
		temp =n;
		int sum=0;
		while(temp>0) {
			int last = temp % 10;
			sum += (Math.pow(last, digits));
			temp=temp/10;
		}
		if(sum == n)
			return true;
		else
			return false;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(isArmstrong(num))
			System.out.println("Armstrong number");
		else
			System.out.println("Not Armstrong number");

	}


}
