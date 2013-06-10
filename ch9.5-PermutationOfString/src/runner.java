import java.util.ArrayList;


public class runner {

	public static ArrayList<String> perm(String origin,int index) {
		ArrayList<String> result = new ArrayList<String>();
		if(index==0){
			result.add(Character.toString( origin.charAt(0)));
			return result;
		}
		else {
			ArrayList<String> prvres =perm(origin,index-1);
			for(String s:prvres) {
				StringBuffer sb = new StringBuffer(s);
				for(int i=0;i<sb.length();i++) {
					sb.insert(i, origin.charAt(index));
					result.add(sb.toString());
					sb.deleteCharAt(i);
				}
				sb.append(origin.charAt(index));
				result.add(sb.toString());
				
			}
			return result;
			
		}
		
		
		
	}
	public static void main(String[] args) {
		ArrayList<String> allper = new ArrayList<String>();
		String origin = "abcd";
		allper = perm(origin,origin.length()-1);
		System.out.println("# of strings:"+allper.size());
		for(String s:allper)
			System.out.println(s);
		

	}

}
