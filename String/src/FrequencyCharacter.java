
public class FrequencyCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "picture perfect";    
        int fre[] = new int[str.length()];
        
        char [] string = str.toCharArray();
        
        for(int i=0; i<str.length();i++) {
//        	fre[i]=1;
        	int count=1;
        	for(int j =i+1;j<str.length();j++) {
        		if(string[i] == string[j] && string[i] != '0') {
//        			fre[i]++;
        			count++;
        			string[j]='0';
        		}
        		fre[i]=count;
        	}
        }
        
        for(int i=0; i<fre.length;i++) {
        	if(string[i] != '0' && string[i] != ' ') {
        		System.out.println(string[i] +" - " +fre[i]);
        	}
        }
	}

}
