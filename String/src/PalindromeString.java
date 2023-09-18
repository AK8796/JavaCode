
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ASASA";
		boolean flag=true;
		
		str=str.toLowerCase();
		
//		for(int i=0; i<str.length()/2; i++) {
//			if(str.charAt(i) == str.charAt(str.length()-i-1)) {
//				flag=true;
//			}else {
//			flag=false;
//			}
//		}
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
}
