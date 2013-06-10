
public class runner {

	public static LinkedListNode partLinkedList(LinkedListNode head, int x) {
		LinkedListNode smallList = new LinkedListNode(0);
		LinkedListNode largeList = new LinkedListNode(0);
		while (head != null) {
			if (head.data<x) {
				smallList.appendToTail(head.data);
			}
			else {
				largeList.appendToTail(head.data);
			}
			head = head.next;
		}
		if (smallList.next == null)
			return largeList.next;
		if (largeList.next == null)
			return smallList.next;
		LinkedListNode tail = smallList;
		while (tail.next!=null) {
			tail=tail.next;
		}
		
		tail.next=largeList.next;
		return smallList.next;
		
		
	}

	
	public static void main(String[] args) {
		LinkedListNode list = new LinkedListNode(5);
		list.appendToTail(7);
		list.appendToTail(3);
		list.appendToTail(9);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(1);

		System.out.println(list.printAll());
		
		System.out.println(partLinkedList(list,3).printAll());
	}

}
