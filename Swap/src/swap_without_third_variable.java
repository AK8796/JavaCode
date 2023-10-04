import java.util.Scanner;

public class swap_without_third_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		int b= sc.nextInt();
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("After swap :");
		a=a+b;//5+4=9
		b=a-b;//5-4=5
		a=a-b;//4
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		a=a^b; // 1 1 =0  && 1 0 =1
		b=b^a;
		a=a^b;
		System.out.println("After bitwise swap :");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		
	}

}
