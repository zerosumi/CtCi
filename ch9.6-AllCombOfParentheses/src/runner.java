import java.util.ArrayList;


public class runner {

	//not complete
	public static ArrayList<String> parenthese(int index) {
		ArrayList<String> result = new ArrayList<String>();
		if(index==1){
			result.add("01");
			return result;
		}
		else {
			ArrayList<String> prvres =parenthese(index-1);
			for(String s:prvres) {
				StringBuffer sb = new StringBuffer(s);
				sb.insert(0, "01");
				result.add(sb.toString());
				sb.deleteCharAt(1);

				for(int i = 2; i<sb.length();i++) {
					if(sb.charAt(i)=='1'&&sb.charAt(i-1)=='0') {
						sb.insert(i, "1");
						//need check if there is duplicate
						result.add(sb.toString());
						sb.deleteCharAt(i);
					}
				}
				
				
			}
			return result;
			
		}
		
		
		
	}
	public static void main(String[] args) {
		ArrayList<String> result = parenthese(4);
		System.out.println("# of possibilities:"+result.size());
		for(String s:result)
			System.out.println(s);

	}

}
