
public class runner {
	
	public static LinkedListNode getLoopBegin(LinkedListNode head) {
		LinkedListNode faster = head;
		LinkedListNode slower = head;
		do {
			faster=faster.next.next;
			slower=slower.next;
		}while(faster!=slower);
		faster = head;
		
		do {
			faster=faster.next;
			slower=slower.next;
		}while(faster!=slower);
		
		return faster;
		
		
		
	}
	
	
	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(5);
		list.appendToTail(7);
		list.appendToTail(3);
		list.appendToTail(9);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(1);
		
		list.next.next.next.next.next.next.next=list.next.next;
		
		System.out.println(getLoopBegin(list).data);
		

	}

}
