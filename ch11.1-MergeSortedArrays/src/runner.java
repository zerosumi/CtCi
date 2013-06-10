
public class runner {

	public static void mergeSorted(int[] a,int[] b, int lasta, int lastb) {

		int cindex = lasta + lastb + 1;
		while(lasta>=0 && lastb>=0) {
			if(b[lastb]>a[lasta]) 
				a[cindex--]=b[lastb--];
			else
				a[cindex--]=a[lasta--];
		}
		if(lastb>0) {
			while(lastb>=0) {
				a[cindex--]=b[lastb--];
			}
		}
		
		
		
	}
	public static void main(String[] args) {
		int[] a = {5,6,7,8,12,25,36,49,54,67,81,99,120,195,0,0,0,0,0,0,0,0,0,0};
		int[] b = {2,3,4,9,11,24,26,58,79,111};
		
		mergeSorted(a,b,13,9);
		for(int i:a)
			System.out.print(i+" ");

	}

}
