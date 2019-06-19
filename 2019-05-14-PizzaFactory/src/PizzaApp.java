
public class PizzaApp {

	public static void main(String[] args) {

		Factory factory = new Factory();
		Pizza pizza1 = factory.createPizza(PizzaType.PIZZA_HAWAI);
		Pizza pizza2 = factory.createPizza(PizzaType.PIZZA_MOZARELLA);
		Pizza pizza3 = factory.createPizza(PizzaType.PIZZA_SAlAMI);
			
		pizza1.orderPizza();
		pizza2.orderPizza();
		pizza3.orderPizza();
		
		//System.out.println("Total pizzas baked: "+factory.getCOUNTER());
		
		PizzaType[]values=PizzaType.values();
		for (PizzaType type : values) {
			System.out.println("Enum: "+ type);
		}
	}
}
