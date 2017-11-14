
public class Main {

	public static void main(String[] args) {
		Toppings toppings = new Toppings("Burger");
		lettuce lettuce = new lettuce();
		tomato tomato = new tomato();
		mushroom mushroom = new mushroom();
		sauce sauce = new sauce();
		onion onion = new onion();
		cheese cheese = new cheese();
		Burger burger = new Burger();
		CreateBurger createBurger = new CreateBurger(burger, toppings);

		System.out.println(lettuce.cost() + tomato.cost() + burger.totalCost());
		System.out.println();
	}
}



//TRY TO FIGURE OUT HOW TO ADD THE COST OF EACH CLASS TO DETERMINE A TOTAL COST
