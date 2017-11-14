
public class CreateBurger {
	private Burger burger;
	private Toppings toppings;
	
	public CreateBurger(Burger burger, Toppings toppings) {
		super();
		this.burger = burger;
		this.toppings = toppings;
	}
	public Burger getBurger() {
		return burger;
	}
	public Toppings getToppings() {
		return toppings;
	}
	
	public double burgerCost(){
		double totalCost = burger.totalCost() + toppings.cost();
		return totalCost;
	}
	
}
