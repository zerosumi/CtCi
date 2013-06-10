
public class runner {

	public static String replaceSpace(String str) {
		
		StringBuffer strbuffer = new StringBuffer();
		for(char c: str.toCharArray()) {
			if (c!=' ')
				strbuffer.append(c);
			else
				strbuffer.append("%20");
			if (strbuffer.length()==str.length())
				break;
		}
		return strbuffer.toString();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I LOVE APPLE!    ";		
		System.out.println("START["+str+"]END");
		System.out.println("START["+replaceSpace(str)+"]END");
	}

}
