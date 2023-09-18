
public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Great Responsibility and power";
		str=str.toLowerCase();
		str=str.replaceAll("\\s", "");

		char string[] = str.toCharArray();
		
		System.out.println("repeated characters : ");
		for (int i = 0; i < string.length; i++) {
			int count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					string[j]='0';
				}
			}
			if (count > 1 && string[i] != '0') {
				System.out.println(string[i]);
			}
		}
	}

}
