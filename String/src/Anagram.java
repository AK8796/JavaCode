import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Akshay Kurundwdae";
		String str2= "AHksAyWRuunEDAdk";
		
	    str1= str1.replace(" ", "").toLowerCase();
	    str2= str2.replace(" ", "").toLowerCase();
	    
	    if(str1.length() == str2.length()) {
	    	char[] string1 =str1.toCharArray();
	    	char[] string2 = str2.toCharArray();
	    	
	    	Arrays.sort(string1);
	    	Arrays.sort(string2);
	    	
	    	if(Arrays.equals(string1, string2 )) {
	    		System.out.println("Anagram");
	    	}else {
	    		System.out.println("Not Anagram");
	    	}
	    }
	}

}
