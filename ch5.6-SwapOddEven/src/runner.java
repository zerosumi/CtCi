
public class runner {

	
	public static int swapOddEven(int number) {
		
		return ((number&(0xaaaaaaaa))>>1 | (number&(0x55555555))<<1);
		
		
		
	}
	public static void main(String[] args) {
		int number = 983;
		System.out.println("Orig:"+Integer.toBinaryString(number));
		System.out.println("Swap:"+Integer.toBinaryString(swapOddEven(number)));
		
	}
}
