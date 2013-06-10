
public class BitInteger {
	
	public static int INTEGER_SIZE;
	int data;
	String dataBin="";
	public BitInteger(int data){
		this.data = data;
		int size = Integer.toBinaryString(data).length();
		

		
		for(int i = INTEGER_SIZE-size;i>0;i--)
			dataBin+="0";
		
		dataBin+=Integer.toBinaryString(data);
		//System.out.print(data+":");
		//System.out.println(dataBin);
	}
	public int fetch(int i){
		int rvalue=Character.getNumericValue(dataBin.charAt(i));
		return rvalue;
		
	}
	
	
}
