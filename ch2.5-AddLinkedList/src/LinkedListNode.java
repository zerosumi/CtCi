
public class LinkedListNode {
	
	int data;
	LinkedListNode next = null;
	
	public LinkedListNode(int d) {
		this.data = d;
	}
	
	public void appendToTail(int d) {
		LinkedListNode end = new LinkedListNode(d);
		LinkedListNode n = this; 
		while(n.next!=null) {
			n=n.next;
		}
		n.next=end;
	}
	public String printAll() {
		if (this.next!=null) {
			return data + this.next.printAll();
		}
		else
			return Integer.toString(data);
	}
	
	
}
