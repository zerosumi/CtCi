import java.util.Arrays;


public class runner {


	public static void main(String[] args) {

		int matrix[][]={{1,2,3,4,5},{1,0,2,2,2},{2,3,4,5,6},{2,5,6,3,0},{2,3,5,6,7}};
		int n = 5;
		
		boolean[] row = new boolean[n];
		boolean[] column = new boolean[n];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(matrix[i][j]==0) {
					row[i]=true;
					column[j]=true;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(row[i]||column[j]) {
					matrix[i][j]=0;
				}
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		
		
	}

}
