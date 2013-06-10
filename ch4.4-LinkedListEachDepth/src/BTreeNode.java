
public class BTreeNode {

	BTreeNode left;
	BTreeNode right;
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
}
