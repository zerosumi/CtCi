
public class runner {
	public static int findNumber(int[] numbers,int start, int end, int x) {
		if(start>end)
			return -1;
		if(numbers[start]==x)
			return numbers[start];
		if(numbers[end]==x)
			return numbers[end];
		int mid = numbers[(start+end)/2];
		if(mid ==x)
			return mid;
		if((numbers[start]<mid && (x<mid&&x>numbers[start])) || (numbers[start]>mid && (x<mid||x>numbers[start]))) {
			System.out.println(mid+"L");
			return findNumber(numbers,start+1,(start+end)/2-1,x);
			
		}
		if((numbers[end]<mid && (x<numbers[end]||x>mid)) || (numbers[end]>mid && (x>mid&&x<numbers[end]))) {
			System.out.println(mid+"R");
			return findNumber(numbers,(start+end)/2+1,end-1,x);
			
		}
		else return -1;
	}
	public static void main(String[] agrs) {
		int[] a = {81,99,120,195,5,6,7,8,12,25,36,49,54,67};
		System.out.print(findNumber(a,0,a.length-1,12));
		
	}
}
