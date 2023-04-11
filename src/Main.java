public class Main {

	public static void main(String[] args) {
		Pizza basePizza = new Pizza(false);
		basePizza.addExtraCheese();
		basePizza.addExtraToppings();
		basePizza.TakeAway();
		basePizza.getBill();
		
//		DeluxePizza dp = new DeluxePizza(true);
//		dp.getBill();
	}
}
