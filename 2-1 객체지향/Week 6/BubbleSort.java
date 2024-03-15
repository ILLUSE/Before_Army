
public class BubbleSort {

	public static void sort(int[] str) {
		
		for(int i=0;i<str.length;i++) {
			
			for (int j =0;j < str.length -1;j++) {
				if(str[j] > str[j+1])
					swap(j,j+1,str);
			}
		}
		
	}

	private static void swap(int j, int i, int[] a) {
	
		 int temp = a[i];
	        a[i] = a[j];
	        a[j] = temp; //original value of a[i]
	        
	}
	
	
	
}
