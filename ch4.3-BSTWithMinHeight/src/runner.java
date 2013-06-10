import java.util.ArrayList;
import java.util.LinkedList;


public class runner {

	public static BTreeNode buildBST(int[] array, int start, int end) {
		if (start>end) 
			return null;
		int middle = (start+end)/2;
		BTreeNode node = new BTreeNode(array[middle]);
		node.left=buildBST(array,start,middle-1);
		node.right=buildBST(array,middle+1,end);
		return node;
		
		
		
		
	}
	//display
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
		int[] array= new int[15];
		for(int i=0;i<15;i++){
			array[i]=i;
		}
		
		BTreeNode root = buildBST(array,0,array.length-1);
		
		ArrayList<LinkedList<BTreeNode>> lists = new ArrayList<LinkedList<BTreeNode>>();
		createLinkedLists(lists,root,0);
		
		for(LinkedList<BTreeNode> l:lists) {
			for(BTreeNode b:l) {
				System.out.print(b.getData());
			}
			System.out.println("");
		}
		
		
	}

}
