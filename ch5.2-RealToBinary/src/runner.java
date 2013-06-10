
public class runner {

	public static String realToBin(double num) throws Exception {
		
		if(num>1||num<0)
			return "ERROR";
		StringBuffer output = new StringBuffer();
		output.append("0.");
		while(num != 0.0) {
			if(num*2 >=1) {
				output.append(1);
				num =num*2-1;
			}
			else{
				output.append(0);
			}
			if(output.length()>=32)
				throw new Exception("ERROR");
			
		}
		return output.toString();
		
		
		
	}
	public static void main(String[] args) throws Exception {
		System.out.println(realToBin(0.5));

	}

}
