
public class runner {

	public static String compString(String str) {
		char s = str.charAt(0);
		int count=0;
		StringBuffer strb = new StringBuffer();
		for (char c:str.toCharArray()) {
			if(c == s) {
				count++;
			}
			else {
				strb.append(s);
				strb.append(count);
				count = 1;
				s = c;
			}
		}
		strb.append(s);
		strb.append(count);
		
		return strb.length()>str.length()?str:strb.toString();
	}
	public static void main(String[] args) {
		String str1 = "aabcccccaaa";
		String str2 = "abcdefgh";
		System.out.println(compString(str1));
		System.out.println(compString(str2));
	}

}
