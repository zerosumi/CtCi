import java.util.Stack;


public class runner {
	public static boolean isPermutation(LinkedListNode head) {
		Stack<Integer> stack = new Stack<Integer>();
		int length = head.getLength();
		for(int i = 1; i <= length/2; i++ ) {
			stack.push(head.data);
			head=head.next;
		}
		if (length%2==1)
			head=head.next;
		for(int i = 1; i <= length/2; i++) {
			if(head.data!=(int)stack.pop())
				return false;
			head = head.next;
		}
		return true;
		
	}

	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(1);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(4);
//		list.appendToTail(4);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(1);

		System.out.println(""+list.getLength() + isPermutation(list));
		
	}

}
