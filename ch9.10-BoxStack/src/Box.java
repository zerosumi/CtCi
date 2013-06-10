
public class Box {

	int height;
	int width;
	int depth;
	public Box(int h,int w, int d) {
		height = h;
		width = w;
		depth = d;
	}
	public boolean canBeAbove(Box bottom) {
		if(bottom==null)
			return true;
		if(this.height<bottom.height&&
				this.width<bottom.width&&
				this.depth<bottom.depth) {
			return true;
		}
		else
			return false;
	}
}
