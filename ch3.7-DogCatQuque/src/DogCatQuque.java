import java.util.LinkedList;


public class DogCatQuque {
	LinkedList<Cat> catlist = new LinkedList<Cat>(); 
	LinkedList<Dog> doglist = new LinkedList<Dog>();
	private int order = 0;
	
	public void enquque(Animal ani) {
		ani.setOrder(order++);
		if (ani instanceof Cat)
			catlist.addLast((Cat)ani);
		else
			doglist.addLast((Dog)ani);
	}
	
	public Animal deququeAny() throws Exception{
		if(catlist.isEmpty()&&doglist.isEmpty())
			throw new Exception("no animal!");
		if(doglist.isEmpty()||catlist.getFirst().isOlderThan(doglist.getFirst())) {
			Animal rani = catlist.removeFirst();
			return rani;
		}
		else {
			Animal rani = doglist.removeFirst();
			return rani;
		}
	}
	
	public Cat deququeCat() {
		Cat rani = catlist.removeFirst();
		return rani;
	}
	
	public Dog deququeDog() {
		Dog rani = doglist.removeFirst();
		return rani;
	}
	
}
