
public class BTreeNode {

	BTreeNode left;
	BTreeNode right;
	BTreeNode previous;
	int i;
	public BTreeNode() {
		i = 0;
		left=null;
		right=null;
	}
	public BTreeNode(int num) {
		this.i=num;
		left=null;
		right=null;
	}
	public int getData() {
		return this.i;
	}
	public void addChild(BTreeNode left, BTreeNode right) {
		this.left=left;
		this.right=right;
		if(left!=null) left.previous=this;
		if(right!=null) right.previous=this;
		
	}
}
