public class Pizza {

	private int price;
	private Boolean veg;
	private int extraChessePrice = 100;
	private int extraToppingsPrice = 150;
	private int backPackPrice = 20;
	private int basePizzaPrice;
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdeed = false;
	private boolean isTakeAwayOpted = false;
	
	public Pizza(Boolean veg) {		
		this.veg = veg;
		if(this.veg) {
			this.price = 300;
		} else {
			this.price = 400;
		}
		basePizzaPrice = this.price;
	}
	public void getPizzaPrice() {
		System.out.println(this.price);
	}
	public void addExtraCheese() {
		isExtraCheeseAdded = true;		
		this.price += extraChessePrice;
	}
	public void addExtraToppings() {
		isExtraToppingsAdeed = true;		
		this.price += extraToppingsPrice;		
	}
	public void TakeAway() {
		isTakeAwayOpted = true;		
		this.price += backPackPrice;		
	}
	public void getBill() {
		String bill = "";
		System.out.println("Pizza: "+ basePizzaPrice);
		if(isExtraCheeseAdded) {
			bill += "Extra cheese added: "+ extraChessePrice + "\n";
		}
		if(isExtraToppingsAdeed) {
			bill += "Extra toppings added: "+ extraToppingsPrice +"\n";
		}
		if(isTakeAwayOpted) {
			bill += "Take away opted: "+ backPackPrice +"\n";
		}
		bill += "Bill: " + this.price + "\n";
		System.out.println(bill);					
	}
}

/*
 * Pizza veg: 300;
 * Pizza non veg: 400;
 * Extra cheese: 100;
 * Extra toppings: 150;
 * Take away: 20;
 * Deluxe pizza includes extra cheese and extra toppings;
 * 
 */
	
	
