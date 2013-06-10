
public abstract class Animal {
	private int order;
	private String name;
	public Animal(String name) {
		this.name = name;
	}
	public void setOrder(int order) {
		this.order=order;
	}
	public int getOrder() {
		return this.order;
	}
	public String getName() {
		return this.name;
	}
	public boolean isOlderThan(Animal ani) {
		return this.order<ani.getOrder();
	}
}
