import java.util.Stack;


public class runner {

	public static Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> tmpstack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			int tmp = stack.pop();
			while (!tmpstack.isEmpty()&&tmpstack.peek()<tmp) {
				stack.push(tmpstack.pop());
			}
			tmpstack.push(tmp);
		}
		return tmpstack;
		
	}
	public static void main(String[] args) {
		Stack<Integer> mystack = new Stack<Integer>();
		mystack.add(3);
		mystack.add(7);
		mystack.add(5);
		mystack.add(14);
		mystack.add(10);
		mystack.add(18);
		mystack.add(6);
		mystack.add(13);
		mystack.add(9);
		mystack=sortStack(mystack);
		
		while(!mystack.isEmpty()){
			System.out.println(mystack.pop());
		}
		
		
	}

}
