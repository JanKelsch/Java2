public class Flower extends Plant {

	public Flower(String name, int height, int growthRate) {
		super(name, height, growthRate);
	}

	@Override
	protected void doSummer() {
		System.out.println(name + " is not growing in Summer. Height: " + height);
	}

	@Override
	protected void doFall() {
		height = 0;
		System.out.println(name + " is cut to zero in Fall. Height: " + height);
	}
}
