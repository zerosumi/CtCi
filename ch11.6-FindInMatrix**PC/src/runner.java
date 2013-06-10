
public class runner {

	//simple linear
	public static boolean findInMatrix(int[][] matrix,int x) {
		int column = matrix[0].length-1;
		int row = 0;
		while(row < matrix.length && column >=0) {
			if(matrix[row][column]==x)
				return true;
			else if(matrix[row][column]>x)
				column--;
			else
				row++;
		}
		return false;
	}
	//binary search
	
	
	public static void main(String[] args) {
		

	}

}
