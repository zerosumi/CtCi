
public class runner {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyQuque newquque = new MyQuque();
		newquque.enquque(1);
		newquque.enquque(2);
		newquque.enquque(3);
		newquque.enquque(4);
		System.out.println("dequque"+newquque.dequque());
		System.out.println("dequque"+newquque.dequque());
		System.out.println("dequque"+newquque.dequque());
		newquque.enquque(5);
		newquque.enquque(6);
		System.out.println("dequque"+newquque.dequque());
		newquque.enquque(7);
		newquque.enquque(8);
		System.out.println("dequque"+newquque.dequque());
		System.out.println("dequque"+newquque.dequque());
		newquque.enquque(9);
		newquque.enquque(10);
		newquque.enquque(11);
		newquque.enquque(12);
		newquque.enquque(13);
		newquque.enquque(14);
		System.out.println("dequque"+newquque.dequque());
		newquque.enquque(15);
		System.out.println("dequque"+newquque.dequque());
		
		
	}

}
