
public class Factory {

	public Pizza createPizza(PizzaType type) {
		switch (type) {
		case PIZZA_SAlAMI:
			return new PizzaSalami();
		case PIZZA_HAWAI:
			return new PizzaHawai();
		case PIZZA_MOZARELLA:
			return new PizzaMozarella();
		default:
			return null;
		}
	}
}
