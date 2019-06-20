public class Cars {

	String name;
	int cost;

	public Cars(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Cars [name=" + name + ", cost=" + cost + "]";
	}
}