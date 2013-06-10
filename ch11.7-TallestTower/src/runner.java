
public class runner {

	public static int getTallestTower(People[] lists, People bottom) {
		int maxCount = 0;
		for(int i = 0;i<lists.length;i++) {
			if(lists[i].isAboveAvailable(bottom)) {
				int tmpCount = getTallestTower(lists,lists[i])+1;
				if(maxCount<tmpCount)
					maxCount = tmpCount;
			} 
		}
		return maxCount;
	}
	
	public static void main(String[] args) {
		People[] lists = {new People(1,3),
				new People(2,4),new People(5,19),
				new People(23,56),new People(9,18),
				new People(20,42),new People(52,49),
				new People(57,98),new People(69,49),
				new People(42,44),new People(89,39),
				new People(78,88),new People(30,46),
				new People(49,44),new People(90,45)};
		System.out.print(getTallestTower(lists,new People(999,999)));

	}

}
