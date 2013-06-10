import java.util.Stack;


public class stackwmin extends Stack<Integer> {
	Stack<Integer> minstack;
	public stackwmin() {
		minstack = new Stack<Integer>();
	}
	public void push(int number) {
		if(number <= (minstack.isEmpty()?Integer.MAX_VALUE:minstack.peek())) {
			minstack.push(number);
		}
		super.push(number);
	}
	public Integer pop() {
		int rvalue = super.pop();
		if(rvalue == minstack.peek()) {
			minstack.pop();
		}
		return rvalue;
	}
	
	
}
