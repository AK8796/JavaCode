
public class StringROtation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String str1 = "AkshayAvaniShraddhaShubham", str2 = "ShraddhashubhamAkshayAvani";  
		  str1=str1.toLowerCase();
		  str2=str2.toLowerCase();
		  
		  if(str1.length() != str2.length()) {
			  System.out.println("Second string is not a rotation of first string");
		  }
		  else {
			  str1=str1.concat(str1);
//			  System.out.println(str1);
			  if(str1.indexOf(str2) != -1) {
				  System.out.println("Second string is a rotation of first string");
			  }
		  }
	}

}
