
public class runner {

	public static boolean isSubtree(BTreeNode t1,BTreeNode t2) {
		if(t2==null)
			return true;
		if(t1==null)
			return false;
		if(t1.getData()==t2.getData()) {
			if(isSame(t1,t2))
				return true;
		}
		return (isSubtree(t1.left,t2)||isSubtree(t1.right,t2));
		
	}
	
	
	
	private static boolean isSame(BTreeNode t1, BTreeNode t2) {
		if(t1==null&&t2==null)
			return true;
		if(t1==null||t2==null)
			return false;
		if(t1.getData()!=t2.getData())
			return false;
		return (isSame(t1.left,t2.left)&&isSame(t1.right,t2.right));
	}

	public static void main(String[] args) {
		BTreeNode node1 = new BTreeNode(1);
		BTreeNode node2 = new BTreeNode(2);
		BTreeNode node3 = new BTreeNode(3);
		BTreeNode node4 = new BTreeNode(4);
		BTreeNode node5 = new BTreeNode(5);
		BTreeNode node6 = new BTreeNode(6);
		
		node1.addChild(node2, node3);
		node2.addChild(node4, node5);
		node3.addChild(node6, null);
		
		BTreeNode node7 = new BTreeNode(3);
		BTreeNode node8 = new BTreeNode(6);
		//false
		node7.addChild(null,node8);
		//true
		//node7.addChild(node8, null);
		System.out.println(isSubtree(node1,node7));

	}

}
