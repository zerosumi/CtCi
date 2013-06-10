
public class runner {
	//Compare base 
	public static boolean isPermutation(String str1, String str2) {
		//O(mn)
		if(str1.length()!=str2.length())
			return false;
		
		boolean[] checkall1 = new boolean[str1.length()];
		boolean[] checkall2 = new boolean[str2.length()];
		
		for (int i=0; i<str1.length();i++) {
			for (int j=0; j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)&&!checkall1[i]&&!checkall2[j]) {
					checkall1[i]=true;
					checkall2[j]=true;
					break;
				}
			}
		}
		for (int i=0;i<str1.length();i++) {
			if(!checkall1[i]||!checkall2[i])
				return false;
		}
		return true;
	}
	
	//Sorting base
	public static String sort(String str) {
		char[] chars = str.toCharArray();
		java.util.Arrays.sort(chars);
		return new String(chars);
	}
	public static boolean isPerBySort(String str1, String str2) {
		if (str1.length()!=str2.length())
			return false;
		return sort(str1).equals(sort(str2));
	}
	
	//Counting base
	public static boolean isPerByCount(String str1, String str2) {
		if (str1.length()!=str2.length())
			return false;
		int[] check = new int[256];
		
		for (char c : str1.toCharArray()) {
			check[c]++;
		}
		for (int i = 0; i<str2.length(); i++) {
			if(--check[(int)str2.charAt(i)] < 0)
				return false;
		}
		return true;
	}
	
	
	public static void main(String arg[]) {
		String str1 = "apple";
		String str2 = "lppea";
		System.out.println(str1+":"+str2+"="+isPermutation(str1,str2));
		System.out.println(str1+":"+str2+"="+isPerBySort(str1,str2));
		System.out.println(str1+":"+str2+"="+isPerByCount(str1,str2));
		
	}
}
