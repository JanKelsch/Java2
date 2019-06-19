public class SuperBoss {

	private static SuperBoss INSTANCE;
	String name;

	private SuperBoss(String name) {
		this.name = name;
	}

	public static SuperBoss getSuperBoss() {
		if (INSTANCE == null) {
			INSTANCE = new SuperBoss("Boss 1");
		}
		return INSTANCE;
	}

	@Override
	public String toString() {
		return "SuperBoss [name=" + name + "]";
	}

}
