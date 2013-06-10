
public class runner {
	public static boolean checkUnique(String str) {
		boolean[] check = new boolean[256];
		for (int i=0; i<str.length();i++) {
			int index=str.charAt(i);
			if (check[index]) {
				return false;
			}
			check[index]=true;
		}
		return true;
	}
	public static boolean checkUniNonExtra(String str) {
		for (int i = 0; i<str.length(); i++) {
			for (int j = i+1; j <str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					return false;
			}
		}
		return true;
		
	}
	
	public static void main(String args[]) {
		String str_uni = "abjiokpqwnds";
		String str_nonuni = "ajvnowpas";

		if(checkUnique(str_uni))
			System.out.println("Unique!");
		else
			System.out.println("Not Unique!");
		
		if(checkUniNonExtra(str_nonuni))
			System.out.println("Unique!");
		else
			System.out.println("Not Unique!");
	}
	
	
	
}
