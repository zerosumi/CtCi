
public class runner {

	public static LinkedListNode addList(LinkedListNode a, LinkedListNode b){
		LinkedListNode sum = new LinkedListNode(0);
		int carry = 0;
		while (a!=null||b!=null||carry!=0) {
			
			sum.appendToTail(((a==null?0:a.data) + (b==null?0:b.data) + carry)%10);
			carry = ((a==null?0:a.data) + (b==null?0:b.data)+carry) >= 10?1:0;
			a = (a==null?null:a.next);
			b = (b==null?null:b.next);
		}
		return sum.next;
	}
	
//	public static void padList(LinkedListNode a, LinkedListNode b) {
//		if(length(a))
//	}
//	public static LinkedListNode addListRev(LinkedListNode a,LinkedListNode b,int carry) {
//		
//		
//		if(a==null&&b==null&&carry==0) {
//			return null;
//		}
//		else 
//			return 
//		
//		
//		
//		
//	}
	public static void main(String[] args) {
		//367
		LinkedListNode lista = new LinkedListNode(7);
		lista.appendToTail(6);
		lista.appendToTail(3);
		//735
		LinkedListNode listb = new LinkedListNode(5);
		listb.appendToTail(3);
		listb.appendToTail(7);
		
		//should be 1102
		System.out.println(addList(lista,listb).printAll());
		
	}

}
