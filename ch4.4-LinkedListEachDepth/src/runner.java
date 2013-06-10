import java.util.ArrayList;
import java.util.LinkedList;


public class runner {

	public static void createLinkedLists(ArrayList<LinkedList<BTreeNode>> lists, BTreeNode node, int level){
		if (node == null)
			return;
		LinkedList<BTreeNode> list;
		if(lists.size()==level) {
			list = new LinkedList<BTreeNode>();
			lists.add(list);
		}
		else
			list = lists.get(level);
		
		list.add(node);
		createLinkedLists(lists,node.left,level+1);
		createLinkedLists(lists,node.right,level+1);	
	}
	public static void main(String[] args) {
		BTreeNode node1 = new BTreeNode(1);
		BTreeNode node2 = new BTreeNode(2);
		BTreeNode node3 = new BTreeNode(3);
		BTreeNode node4 = new BTreeNode(4);
		BTreeNode node5 = new BTreeNode(5);
		BTreeNode node6 = new BTreeNode(6);
		node1.left=node2;
		node1.right=node3;
		node2.left=node4;
		node2.right=node5;
		//balance
		//node3.left=node6;
		//unbalance
		node4.left=node6;
		
		ArrayList<LinkedList<BTreeNode>> lists = new ArrayList<LinkedList<BTreeNode>>();
		createLinkedLists(lists,node1,0);
		for(LinkedList<BTreeNode> l:lists) {
			for(BTreeNode b:l) {
				System.out.print(b.getData());
			}
			System.out.println("");
		}

	}

}
