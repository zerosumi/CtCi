import java.util.ArrayList;


public class runner {


	public static ArrayList<ArrayList<Integer>> allsubsets(ArrayList<Integer> origin, int index) {
		ArrayList<ArrayList<Integer>> result;
		if(index == origin.size()) {
			result = new ArrayList<ArrayList<Integer>>();
			result.add(new ArrayList<Integer>());
		}
		else{
			result = allsubsets(origin, index+1);
			ArrayList<ArrayList<Integer>> moresubset = new ArrayList<ArrayList<Integer>>(); 
			for(ArrayList<Integer> s:result) {
				ArrayList<Integer> tmp = new ArrayList<Integer> ();
				tmp.addAll(s);
				tmp.add(origin.get(index));
				moresubset.add(tmp);
			}
			result.addAll(moresubset);
			
			
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> origin = new ArrayList<Integer>();
		origin.add(1);
		origin.add(2);
		origin.add(3);
		//origin.add(4);
		//origin.add(5);
		//origin.add(6);
		ArrayList<ArrayList<Integer>> result = allsubsets(origin,0);
		
		for(int i = 0;i<result.size();i++){
			for(int j = 0; j<result.get(i).size();j++) {
				System.out.print(result.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		
	}

}
