
public class runner {

	public static void findSum(BTreeNode node,int sum, int[] path, int level) {
		if(node ==null)
			return;
		path[level]=node.getData();
		
		int t=0;
		for(int i =level; i>=0;i--) {
			t+=path[i];
			if(t==sum) {
				print(path,i,level);
			}
		}
		findSum(node.left,sum,path,level+1);
		findSum(node.right,sum,path,level+1);
		
		path[level]=Integer.MIN_VALUE;
		
	}
	public static void findSum(BTreeNode node, int sum) {
		int depth = depth(node);
		int[] path = new int[depth];
		findSum(node,sum,path,0);
	}
	public static void print(int[]path, int start, int end) {
		for(int i = start;i<=end;i++) {
			System.out.print(path[i]+" ");
		}
		System.out.println();
	}
	public static int depth(BTreeNode node) {
		if(node==null)
			return 0;
		else
			return 1+Math.max(depth(node.left), depth(node.right));
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
		
		findSum(node1,6);

	}

}
