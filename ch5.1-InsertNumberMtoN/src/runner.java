
public class runner {

	public static int insertNumber(int n, int m, int i, int j) {
		int allOnes = ~0;
		
		int leftMask = allOnes<<(j+1);
		int rightMask = (1<<i)-1;
		int mask = leftMask|rightMask;
		
		return (n&mask) | (m<<i);
		
		
	}
	
	
	
	public static void main(String[] args) {
		int n = 4234, m = 13, i = 4, j = 7;
		System.out.println("N="+Integer.toBinaryString(n));
		System.out.println("M="+Integer.toBinaryString(m));
		System.out.println("i="+Integer.toBinaryString(i));
		System.out.println("j="+Integer.toBinaryString(j));
		System.out.println("R="+Integer.toBinaryString(insertNumber(n,m,i,j)));
		
				
		
		
		
	}

}
