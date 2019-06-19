public class PlantsApp {

	public static void main(String[] args) {

		Flower f1 = new Flower("Tulip", 0, 10);
		Tree t1 = new Tree("Oak", 20, 2);

		f1.growthPerSeason();
		t1.growthPerSeason();

		Plant[] plants = { f1, t1 };
		growPlants(plants, 4);

	}

	public static void growPlants(Plant[] plants, int years) {
		for (int i = 1; i < years; i++) {
			for (Plant plant : plants) {
				plant.growthPerSeason();
			}
		}
	}
}
