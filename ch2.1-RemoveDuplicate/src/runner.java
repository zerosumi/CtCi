import java.util.Hashtable;




public class runner {
	//hashtable extra cache
	public static void removeDuplicate(LinkedListNode node) {
		Hashtable table = new Hashtable();
		LinkedListNode previous = null;
		while (node != null) {
			if(table.containsKey(node.data)) {
				previous.next=node.next;
			}
			else {
				table.put(node.data, true);
				previous = node;
			}
			node=node.next;
		}
		
	}
	//nonextra cache
	public static void removeDupWOCache(LinkedListNode node) {
		LinkedListNode runner;
		while (node != null) {
			runner = node;
			while (runner.next != null) {
				if(runner.next.data == node.data) {
					runner.next=runner.next.next;
				}
				else
					runner=runner.next;
			}
			node=node.next;
			
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
//		removeDuplicate(list);
		removeDupWOCache(list);
		System.out.println(list.printAll());

	}

}
