import java.util.Stack;


public class runner {

	public static void main(String[] args) {

		Tower left = new Tower("lefttower");
		Tower middle = new Tower("middletower");
		Tower right = new Tower("righttower");
		int n = 5;
		for(int i = n; i>0; i--) 
			left.addDisk(i);
		left.mainMove(n, middle, right);
	}

}
