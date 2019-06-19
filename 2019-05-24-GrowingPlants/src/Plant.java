public abstract class Plant {

	protected String name;
	protected int height;
	protected int growthRate;

	public Plant(String name, int height, int growthRate) {
		this.name = name;
		this.height = height;
		this.growthRate = growthRate;
	}

	public void growthPerSeason() {
		doSpring();
		doSummer();
		doFall();
		doWinter();
	}

	public void doSpring() {
		height = height + growthRate;
		System.out.println(name + " has grow in Spring on " + growthRate + ". Height: " + height);
	}

	protected abstract void doSummer();

	protected abstract void doFall();

	private void doWinter() {
		System.out.println(name + " is not growing in Winter. Height: " + height);
	}
}
