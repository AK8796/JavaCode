
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hi I am Akshay";
		String str = "Dream Big";
		String reversestr= "";
		
		for(int i=str.length()-1; i>=0; i--) {
			reversestr = reversestr + str.charAt(i);
		}
		
		System.out.println("Original String : " + str);
		System.out.println("Reversed String : " + reversestr);
		
		System.out.println();
		StringBuilder str2 = new StringBuilder(str1);
		str2.reverse();
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
