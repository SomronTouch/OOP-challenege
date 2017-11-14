
public class Burger {

		private boolean bun;
		private boolean patty;
		private double price;
		
		public Burger() {
			super();
			this.bun = true;
			this.patty = true;
			this.price = 8.00;
		}
		//getter
		public boolean isBun() {
			return bun;
		}

		public boolean isPatty() {
			return patty;
		}

		public double getPrice() {
			return price;
		}
		//methods
		
		public double totalCost(){
			return this.price;
		}
		
}
