import java.util.*;

public class ThirdLargestElement {
	
	private static int getNumber(int[] a, int i) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[i-3];
	}
	
	private static int getNumber1(Integer [] c, int i) {
		List<Integer> list= Arrays.asList(c);
		Collections.sort(list);
		int element= list.get(i-3);
		return element;
	}
	
	private static int getNumber2(int [] b, int i) {
		int temp;
		for(int j=0; j<b.length;j++) {
			for(int k=j+1; k<b.length;k++) {
				if(b[j]>b[k]) {
					temp=b[j];
					b[j]=b[k];
					b[k]=temp;
				}
			}
		}
		
		return b[i-3];
	}
	
     

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,8,9,4,3};
		int b[] = new int[]{2,5,3,6,9,10,7};
		Integer c[]= {2,5,3,9,7,4,6};
		System.out.println("Third Largest number : " +getNumber(a,a.length));
		System.out.println("Third largest number : " +getNumber1(c,c.length));
		System.out.println("Third largest number : " +getNumber2(b,b.length));

	}

	

}
