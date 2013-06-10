import java.util.Stack;


public class MyQuque {
	Stack<Integer> enstack;
	Stack<Integer> destack;
	boolean enflag;
	
	public MyQuque() {
		enstack = new Stack<Integer>();
		destack = new Stack<Integer>();
		enflag = true;
	}
	
	public void enquque(int number) {
		if(enflag) {
			enstack.push(number);
			System.out.println("enquque "+number);
		}
		else {
			while(!destack.isEmpty()) {
				enstack.push(destack.pop());
			}
			enstack.push(number);
			enflag = true;
			System.out.println("enquque "+number);
		}
	}
	public int dequque() throws Exception{
		
		if(destack.isEmpty()&&enstack.isEmpty())
			throw new Exception ("empty quque!");
		if(!enflag) {
			return destack.pop();
		}
		else {
			while(!enstack.isEmpty()) {
				destack.push(enstack.pop());
			}
			enflag = false;
			return destack.pop();
		}
	}
}
