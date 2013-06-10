import java.util.ArrayList;


public class runner {

	public static int getStackHeight(ArrayList<Box> boxes) {
		int height = 0;
		for(int i = 0; i < boxes.size();i++) {
			height += boxes.get(i).height;
		}
		return height;
	}
	public static ArrayList<Box> buildStack(ArrayList<Box> boxes,Box bottom) {
		ArrayList<Box> maxStack = null;
		int maxStackHeight = 0;
		for(int i =0; i<boxes.size();i++) {
			if(boxes.get(i).canBeAbove(bottom)) {
				ArrayList<Box> newStack = buildStack(boxes,boxes.get(i));
				int newStackHeight = getStackHeight(newStack);
				if(newStackHeight>maxStackHeight){
					maxStack = newStack;
					maxStackHeight = newStackHeight;
				}
			}
		}
		if(maxStack == null)
			maxStack = new ArrayList<Box>();
		if(bottom != null) {
			maxStack.add(0, bottom);
		}
		return maxStack;
		
		
	}
	
	
	public static void main(String[] args) {
		ArrayList<Box> boxes = new ArrayList<Box>();
		boxes.add(new Box(31,46,89));
		boxes.add(new Box(93,98,83));
		boxes.add(new Box(30,49,80));
		boxes.add(new Box(12,33,43));
		boxes.add(new Box(3,4,8));
		boxes.add(new Box(99,102,89));
		boxes.add(new Box(64,55,88));
		boxes.add(new Box(12,55,23));
		ArrayList<Box> stack = buildStack(boxes,null);
		for(Box b:stack)
			System.out.println(b.depth+" "+b.height+" "+b.width);
		
		
		
	}
}
