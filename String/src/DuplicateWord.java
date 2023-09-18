
public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String string = "Big black bug bit a big black dog on his big black nose";    
        
        string = string.toLowerCase();
        String[] word= string.split(" ");
        
        System.out.println("Duplicate words : ");
        for(int i=0; i<word.length;i++) {
        	int count=1;
        	for(int j= i+1; j<word.length;j++) {
        		if(word[i].equals(word[j]) && word[i] != "0") {
        			count++;
        			word[j]="0";
        		}
        	}
        	if(count>1) {
        		System.out.println(word[i]);
        	}
        }

	}

}
