
public class runner {


	public static boolean doesHaveRoute(DGraphNode start, DGraphNode end) {
		start.setState(1);
		for (DGraphNode rnode: start.getAdjacent()) {
			if(!rnode.isVisited()) {
				if (rnode == end)
					return true;
				else {
					rnode.setState(1);
					if(!doesHaveRoute(rnode,end))
						continue;
					else
						return true;
				}
			}
			
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		DGraphNode node1 = new DGraphNode();
		DGraphNode node2 = new DGraphNode();
		DGraphNode node3 = new DGraphNode();
		DGraphNode node4 = new DGraphNode();
		DGraphNode node5 = new DGraphNode();
		DGraphNode node6 = new DGraphNode();
		DGraphNode node7 = new DGraphNode();
		
		node1.addAdjacent(node2);
		node1.addAdjacent(node3);
		node2.addAdjacent(node7);
		node2.addAdjacent(node4);
		node3.addAdjacent(node6);
		node4.addAdjacent(node5);
		node4.addAdjacent(node3);
		node6.addAdjacent(node5);
		
		//connect
		System.out.println("node2 and node6 is connected?" + doesHaveRoute(node2,node6));

		//notconnect
		System.out.println("node3 and node7 is connected?" + doesHaveRoute(node3,node7));

	}

}
