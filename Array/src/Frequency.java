

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
		int fr[] = new int [arr1.length];
		int visited = -1;
		for(int i=0; i< arr1.length; i++) {
			int count=1;
			for(int j=i+1; j<arr1.length;j++) {
				if(arr1[i] == arr1[j]) {
					count++;
					fr[j] = visited;
				}
			}
			if(fr[i] != visited) { // to avoid counting of -1
				fr[i]= count;
			}
		}
		
		for(int i=0; i<fr.length;i++) {
			if(fr[i] != visited) {
				System.out.println( arr1[i] + "|" + fr[i]);
			}
		}

	}

}
