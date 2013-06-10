
public class runner {
	//
	public static LinkedListNode getKthToLast(LinkedListNode head, int k) {
		int count = 0;
		LinkedListNode start = head;
		while(start != null) {
			start = start.next;
			count++;
		}
		if(count < k) {
			return null;
		}
		else if(count == k) {
			return head;
		}
		else {
			start = head;
			while(true) {
				start = start.next;
				k++;
				if(count == k)
					return start;
			}
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode list = new LinkedListNode(1);
		list.appendToTail(2);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(4);
		list.appendToTail(1);
		
		System.out.println(list.printAll());
		System.out.println(getKthToLast(list,2).data);
		
		
	}

}
