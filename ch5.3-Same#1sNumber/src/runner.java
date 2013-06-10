
public class runner {

	public static int getNext(int number) {
		int c = number;
		int c1 = 0;
		int c0 = 0;
		while ((c!=0) && ((c&1)==0)) {
			c0++;
			c=c>>1;
		}
		while ((c&1)==1) {
			c1++;
			c=c>>1;
		}
		
		number = number | (1 << (c0+c1));
		number = number & (~0) << (c0+c1);
		number = number | ~((~0) << (c1-1));
		return number;
		
	}
	
	public static int getPrvs(int number) {
		int c = number;
		int c1 = 0;
		int c0 = 0;
		while ((c!=0) && ((c&1)==1)) {
			c1++;
			c=c>>1;
		}
		while ((c&1)==0) {
			c0++;
			c=c>>1;
		}
		//System.out.print(c0);
		//System.out.print(c1);
		number = number & ((~0) << (c0+c1+1));
		number = number | ( (~((~0)<<(c1+1))) << (c0-1));
		return number;
		
	}
	
	
	public static void main(String[] args) {
		int number = 13948;
		System.out.println("Orig:"+Integer.toBinaryString(number));
		System.out.println("Next:"+Integer.toBinaryString(getNext(number)));
		System.out.println("Prvs:"+Integer.toBinaryString(getPrvs(number)));
		
		
	}
}
