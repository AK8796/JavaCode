
public class removeWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = " Akshay Avani Shraddha Shubham ";
		System.out.println("String before removing white spaces : "+str);
		
		str=str.replaceAll("\\s", "");
//		str=str.replace(" ", "");
		System.out.println("String after removing white spaces : "+str);
	}

}
