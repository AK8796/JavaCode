import java.util.Scanner;

public class Prime1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		int total=0;
		for(int i=2; i<=n;i++)
		{
			int count=0;
			for(int j=1; j<=i;j++) 
			{
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				total++;
				System.out.print(i+" ");
			}
		}
		System.out.println( "\n"+total +" total number of prime numbers");
	}
}

	