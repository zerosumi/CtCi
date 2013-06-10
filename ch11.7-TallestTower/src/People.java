
public class People {

	public double height;
	public double weight;
	public People(double h,double w) {
		this.height=h;
		this.weight=w;
	}
	public boolean isAboveAvailable(People bottom) {
		if(this.height<bottom.height&&this.weight<bottom.weight)
			return true;
		else
			return false;
	}
	
	
	
}
