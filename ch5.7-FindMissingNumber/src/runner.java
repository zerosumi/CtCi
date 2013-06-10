import java.util.ArrayList;


public class runner {
	
	public static int findMissing(ArrayList<BitInteger> array) {
		
		return findMissing(array, BitInteger.INTEGER_SIZE-1);
		
	}
	
	

	
	private static int findMissing(ArrayList<BitInteger> array, int position) {
		if (position<0)
			return 0;
		
		ArrayList<BitInteger> zero = new ArrayList<BitInteger>();
		ArrayList<BitInteger> one = new ArrayList<BitInteger>();
		
		for (BitInteger b :array) {
			//System.out.println(b.dataBin+":"+position+":"+b.fetch(position));
			if (b.fetch(position) == 0)
				zero.add(b);
			else
				one.add(b);
		}
		
		if(zero.size()>one.size()){
			int v = findMissing(one, position-1);
			return (v<<1)|1;
		}
		else {
			int v = findMissing(zero, position-1);
			return (v<<1)|0;
		}
		
	}




	public static void main(String[] args) {
		BitInteger.INTEGER_SIZE=5;
		ArrayList<BitInteger> array = new ArrayList<BitInteger>();
		for(int i=0;i<32;i++) {
			if(i!=25)
				array.add(new BitInteger(i));
		}
		
		System.out.print(findMissing(array));
		
		
	}

}
