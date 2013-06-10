
public class runner {

	public static BTreeNode findNextNode(BTreeNode node) {
		if(node == null)
			return null;
		if(node.right!=null){
			return mostLeftNode(node.right);
		}
		else {
			BTreeNode pnode = node.previous;
			while(pnode!=null&&pnode.right==node){
				node=pnode;
				pnode=pnode.previous;
			}
			return pnode;
		}
		
		
	}
	private static BTreeNode mostLeftNode(BTreeNode node) {
		if(node.left==null)
			return node;
		else return mostLeftNode(node.left);
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
		
		
		BTreeNode target = node5;
		BTreeNode rnode = findNextNode(target);
		System.out.println("find node"+target.getData()+"'s next is ");
		if(rnode == null)
			System.out.println("no such node!");
		else
			System.out.println("node"+rnode.getData());

	}

}
