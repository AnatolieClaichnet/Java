package home;
import ingredients.*;

public class Coffee {
	Sugar sugar;
	Water water;
	CoffeePowder coffeePowder;
	
	public Coffee(Sugar sugar, Water water, CoffeePowder coffeePowder ) {
		this.sugar = sugar;
		this.water = water;
		this.coffeePowder = coffeePowder;
	}
	
	public void printIngredients() {
		sugar.printSugar();
		water.printWater();
		coffeePowder.printCoffeePowder();
	}

}
