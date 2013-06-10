import java.util.ArrayList;


public class runner {

	public static void eightQueen(Integer[] tmpresult, int row, ArrayList<Integer[]> result) {
		if(row==8)
			result.add(tmpresult.clone());
		for(int i=0;i<8;i++) {
			if(checkAvailable(tmpresult,row,i)){
				tmpresult[row]=i;
				eightQueen(tmpresult,row+1,result);
			}
		}
		
		
		
	}
	
	public static boolean checkAvailable(Integer[]tmpresult, int row, int colomn) {
		for(int i = 0; i< row;i++) {
			if(tmpresult[i]==colomn)
				return false;
			if(Math.abs(tmpresult[i]-colomn)==(row-i))
				return false;			
		}
		return true;
		
	}
	public static void main(String[] args) {
		Integer[] tmpresult = {0,0,0,0,0,0,0,0};
		ArrayList<Integer[]> result = new ArrayList<Integer[]>();
		eightQueen(tmpresult,0,result);
		for(Integer[] i : result) {
			for(Integer ii:i) {
			System.out.print(ii);
			}
			System.out.println();
		}
	}

}
