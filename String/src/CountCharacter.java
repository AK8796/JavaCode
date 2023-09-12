
public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="Hi I am Akshay Manik Kurundwade";
		int count=0;
		
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i) != ' '){
				count++;
			}
		}
		System.out.println("Count of string : " +count);
	}

}
