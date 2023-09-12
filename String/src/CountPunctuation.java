
public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "He said, 'Your friend loves you.' I heard it with my own ears.";
		int count =0;
		
		for(int i=0; i<string.length();i++) {
			if(string.charAt(i) == '!' || string.charAt(i) == '.' || string.charAt(i)=='\'' || string.charAt(i) == '\"' || string.charAt(i) == '?' || 
					string.charAt(i)== ';' || string.charAt(i)== ',' || string.charAt(i)==':' || string.charAt(i)=='-') {
				count ++;
			}
		}
		System.out.println("The number of punctuations exists in the string is: "+count);

	}

}
