import java.util.ArrayList;
import java.util.Stack;


public class SetOfStacks{
	int threshold = 100;
	ArrayList<Stack<Integer>> stackset = new ArrayList<Stack<Integer>> ();
	
	public void push(int number) {
		if (stackset.size()==0)
			stackset.add(new Stack<Integer>());
		else if(stackset.get(stackset.size()-1).size()>=threshold)
			stackset.add(new Stack<Integer>());
		stackset.get(stackset.size()-1).push(number);
	}
	public int pop() {
		int rvalue = stackset.get(stackset.size()-1).pop();
		if(stackset.get(stackset.size()-1).size()==0)
			stackset.remove(stackset.size()-1);
		return rvalue;
	}
	public int popAt(int index) {
		int rvalue = stackset.get(index).pop();
		if(stackset.get(index).size()==0)
			stackset.remove(index);
		return rvalue;
	}
	
	
	
	
}
