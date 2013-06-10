
public class runner {

	//left-shift not complete
	//
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SetOfStacks newstack = new SetOfStacks();
		for (int i = 1; i <= 250; i++) {
			newstack.push(i);
		}
		for (int i = 1; i <= 250; i++) {
			System.out.println(newstack.pop());
		}

	}

}
