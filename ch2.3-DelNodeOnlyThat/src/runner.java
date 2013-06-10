
public class runner {
	
	public static void delOnlyNode(LinkedListNode node) {
		
		while (node.next!=null) {
			node.data=node.next.data;

			if (node.next.next==null) {
				node.next=null;
			}
			else {
				node=node.next;
			}

		}
 		
	}
	
	public static void main(String[] args) {
		
		LinkedListNode list = new LinkedListNode(1);
		list.appendToTail(2);
		list.appendToTail(2);
		list.appendToTail(3);
		list.appendToTail(2);
		list.appendToTail(4);
		list.appendToTail(1);
		
		System.out.println(list.printAll());
		delOnlyNode(list.next.next.next);
		System.out.println(list.printAll());
		

	}

}
