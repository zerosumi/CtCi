import java.util.LinkedList;


public class DGraphNode {
	public enum State {
		unvisited, visited, visiting;
	}
	public State state; 
	public LinkedList<DGraphNode> nextNode;
	
	public DGraphNode() {
		this.state = State.unvisited;
		nextNode=new LinkedList<DGraphNode>();
		
	}
	public void addAdjacent(DGraphNode adjnode) {
		nextNode.add(adjnode);
	}
	public LinkedList<DGraphNode> getAdjacent() {
		return this.nextNode;
	}
	public void setState(int i) {
		switch(i) {
			case 0:
				state=State.unvisited;
				break;
			case 1:
				state=State.visited;
				break;
			case 2:
				state=State.visiting;
				break;
			default:
				break;
		}
	}
	public boolean isVisited() {
		return this.state==State.visited?true:false;
	}
	
	
	
}
