
public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "Hi I am Akshay Manik Kurundwade";
		int countV=0,countC=0;
		
		 //Converting entire string to lower case to reduce the comparisons 
		string = string.toLowerCase();
		
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i) =='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u' ) {
				countV++;
			}else if(string.charAt(i) >='a' && string.charAt(i)<='z'){
				countC++;
			}
		}
		System.out.println("Count of Vowels : "+countV);
		System.out.println("Count of Consonant : "+countC);

	}

}
