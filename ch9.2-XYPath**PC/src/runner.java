
public class runner {

	public static int factorial(int a) {
		int result=1;
		for(int i = 2;i<=a;i++) {
			result *=i;
		}
		return result;
	}
	
	public static int pathCount(int x, int y) {
		
		return factorial(x+y)/(factorial(x)*factorial(y));
		
		
	}
	
	
	public static void main(String[] args){
		
		System.out.println(pathCount(2,3));
		
		
	}
}
