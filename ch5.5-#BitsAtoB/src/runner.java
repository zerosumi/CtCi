
public class runner {


	public static int count(int a, int b) {
		
		int count = 0;
		for(int c = a^b; c!=0; c=c&(c-1)) {
			count++;
		}
		return count;
		
		
	}
	public static void main(String[] args) {
		
		int a = 346, b = 397;
		System.out.println("A:"+Integer.toBinaryString(a));
		System.out.println("B:"+Integer.toBinaryString(b));
		System.out.println(count(a,b));

	}

}
