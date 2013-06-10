import java.util.LinkedList;


public class runner {

	public static boolean checkBST(BTreeNode root) {
		LinkedList<BTreeNode> lists = new LinkedList<BTreeNode> ();
		createInOrder(lists,root);
		
		for(int i = 0;i<lists.size()-1;i++) {
			if(lists.get(i).getData()>lists.get(i+1).getData())
				return false;
		}
		return true;
		
		
		
		
	}
	
	public static void createInOrder(LinkedList<BTreeNode> lists,BTreeNode node) {
		if(node == null)
			return;
		else {
			BTreeNode lnode = node.left;
			BTreeNode rnode = node.right;
			createInOrder(lists,lnode);

			lists.add(node);
			
			createInOrder(lists,rnode);

			
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		BTreeNode node1 = new BTreeNode(1);
		BTreeNode node2 = new BTreeNode(2);
		BTreeNode node3 = new BTreeNode(3);
		BTreeNode node4 = new BTreeNode(4);
		BTreeNode node5 = new BTreeNode(5);
		BTreeNode node6 = new BTreeNode(6);
		node3.left=node2;
		node3.right=node5;
		node2.left=node1;
		node5.right=node6;
		node5.left=node4;
		//not-BST
		BTreeNode node7 = new BTreeNode(7);
		node1.left=node7;
		
		System.out.println("Is BST? "+checkBST(node3));

	}

}
