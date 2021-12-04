package starts;

class SafeInstance {
	 public static void main(String[]args){
		 Private_Car Porsche = new Private_Car();
		 Porsche.options("Porsche", "Green", "Hetchback", "spreads");
		 Porsche.call();
		 Private_Car Bentley = new Private_Car();
		 Bentley.options("Bentley", "Red", "Cabriolet", "fly");
		 Bentley.call();
	 } 
	 }
