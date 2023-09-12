
public class DivideString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aaaabbbbcccc";
		//n determines the variable that divide the string in 'n' equal parts 
		int n=3;
		int len=string.length();
		int chars = len/3;
		
		if(len % n != 0 ) {
			System.out.println("String cannot divide in equal parts");
		}else {
			for(int i=0; i<len; i=i+chars) {
//				String substr = string.substring(i,i+chars);
//				System.out.println(substr); 
				System.out.println(string.substring(i,i+chars)); 
			}
			 
		}
	}

}
