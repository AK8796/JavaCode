
public class changeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Akshay Avani Shraddha Shubham";
		
		StringBuffer newstr= new StringBuffer(str);
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				newstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else {
				newstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println(newstr);
	}

}
/*
 Character.isLowerCase(char) is a method in Java's Character class that checks 
 if a given character is lowercase. If the character is lowercase, it returns true; otherwise, it returns false
 */
