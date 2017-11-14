
public class Toppings extends Burger {
	private String name;

	public Toppings(String name) {
		super();
		this.name = name;
	}

		//getters
		public String getName() {
			return name;
		}

		public double cost(){
			return 0;
		}

		@Override
		public double totalCost() {
			return super.totalCost() + cost();
		}

}

//Lettuce Class
class lettuce extends Toppings{
	
	public lettuce() {
		super("lettuce");
	}
	
	@Override
	public double cost() {
		return 0.50;
	}
	
	@Override
	public double totalCost() {
		return super.totalCost();
	}


}
//tomato class
class tomato extends Toppings{

	public tomato() {
		super("tomato");		
	}

	@Override
	public double cost() {
		return 0.50;
	}

	@Override
	public double totalCost() {
		return super.totalCost();
	}
	
	
	
}
//mushroom class
class mushroom extends Toppings{

	public mushroom() {
		super("mushroom");		
	}

	@Override
	public double cost() {
		return 1.00;
	}

	@Override
	public double totalCost() {
		return super.totalCost();
	}
		
}
//sauce class
class sauce extends Toppings{

	public sauce() {
		super("sauce");		
	}

	@Override
	public double cost() {
		return 2.00;
	}

	@Override
	public double totalCost() {
		return super.totalCost();
	}
	
	
}
//onion class
class onion extends Toppings{

	public onion() {
		super("onion");		
	}

	@Override
	public double cost() {
		return 0.50;
	}

	@Override
	public double totalCost() {
		return super.totalCost();
	}
	
	
}

//cheese class
class cheese extends Toppings{

	public cheese() {
		super("cheese");		
	}

	@Override
	public double cost() {
		return 1.50;
	}

	@Override
	public double totalCost() {
		return super.totalCost();
	}
	
	
}

