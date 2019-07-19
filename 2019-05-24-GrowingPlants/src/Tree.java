public class Tree extends Plant {
	
	public Tree(String name, int height, int growthRate) {
		super(name, height, growthRate);
	}

	@Override
	protected void doSummer() {
		height = height + growthRate;
		System.out.println(name + " has grow in Summer on " + growthRate + ". Height: " + height);
	}

	@Override
	protected void doFall() {
		System.out.println(name + " is not growing in Fall. Height: " +height);
	}
}
