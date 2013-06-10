
public class runner {

	public static boolean isSubstring(String str, String substr) {
		int m = str.length();
		int n = substr.length();
		for(int i = n-1; i < m; i++) {
			for (int j = n-1; j >= 0; j--) {
				if(str.charAt(i-n+1+j)==substr.charAt(j)) {
					if(j==0) return true;
					continue;
				}
				else break;
			}
		}
		return false;
		
	}
	
	public static void main(String args[]) {
		String str = "here is a simple example";
		String substr = "example";
		//System.out.println(str.charAt(0));
		System.out.println(isSubstring(str,substr));
		
	}
}
