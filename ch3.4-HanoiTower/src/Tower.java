import java.util.Stack;


public class Tower {
	
	private String towerName;
	private Stack<Integer> disks;
	
	public Tower(String name) {
		disks = new Stack<Integer>();
		this.towerName = name;
	}
	public String getName(){
		return this.towerName;
	}
	public void addDisk(int disknum) {
		if (!disks.isEmpty()&&disks.peek()<=disknum)
			System.out.println("Error place disk"+disknum);
		else
			disks.push(disknum);
	}
	public void moveTo(Tower dest) {
		int rdisk = disks.pop();
		dest.addDisk(rdisk);
		System.out.println("Move disk"+rdisk+" from "+this.towerName+" to "+dest.getName());
	}
	public void mainMove(int n, Tower buffer, Tower dest) {
		if (n > 0) {
			mainMove(n-1, dest, buffer);
			moveTo(dest);
			buffer.mainMove(n-1, this, dest);
		}
		
		
	}
	
	
	
}
