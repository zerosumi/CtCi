public class runner {
	
	//o(n^2) solution
	public static int getHeight(BTreeNode root) {
		if(root == null)
			return 0;
		else
			return Math.max(getHeight(root.left),getHeight(root.right))+1;
	}

	public static boolean isTreeBalance(BTreeNode root) {
		if(root == null)
			return true;
		int diff = getHeight(root.left)-getHeight(root.right);
		if (Math.abs(diff)>1)
			return false;
		else
			return isTreeBalance(root.left)&&isTreeBalance(root.right);
	}
	
	//o(n) solution
	public static int checkHeight(BTreeNode root) {
		if(root == null)
			return 0;
		if(checkHeight(root.left)==-1)
			return -1;
		if(checkHeight(root.right)==-1)
			return -1;
		int diff = checkHeight(root.left)-checkHeight(root.right);
		if (Math.abs(diff)>1)
			return -1;
		else
			return Math.max(checkHeight(root.left),checkHeight(root.right))+1;
	}
	
	public static void main(String[] args) {
		BTreeNode node1 = new BTreeNode();
		BTreeNode node2 = new BTreeNode();
		BTreeNode node3 = new BTreeNode();
		BTreeNode node4 = new BTreeNode();
		BTreeNode node5 = new BTreeNode();
		BTreeNode node6 = new BTreeNode();
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		//balance
		node3.left=node6;
		//unbalance
		//node4.left=node6;
		//solution1
		//System.out.println("tree balance? "+isTreeBalance(node1));
		//solution2
		System.out.println("tree balance? "+checkHeight(node1));
		
	}

}
