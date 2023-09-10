
public class ToCheckPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=0;
		int n=7;
		
		
		if(n==0 || n==1)
			System.out.println(n+"not a prime number");
		else
		{
			for(int i=2; i<n/2; i++) {
				if(n%i==0) {
					System.out.println(n + "not a prime number");
				flag=1;
				break;
				}
			}
		}
		if(flag==0)
			System.out.println(n +"prime number");

	}

}
