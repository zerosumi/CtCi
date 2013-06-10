import java.util.Arrays;


public class runner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4},{5,5,5,5,5}};
		int n = 5;
		int tmp = 0;
		
		for (int layer = 0; layer < n/2; layer++) {
			
			for (int i = layer; i< n-1-layer; i++) {
			
				tmp = matrix[layer][i];
			
				matrix[layer][i] = matrix[n-1-i][layer];
				
				matrix[n-1-i][layer] = matrix[n-1-layer][n-1-i];
				
				matrix[n-1-layer][n-1-i] = matrix[i][n-1-layer];
				
				matrix[i][n-1-layer] = tmp;
			}
		}
		System.out.println(Arrays.deepToString(matrix));
		
		
		
		
	}

}
