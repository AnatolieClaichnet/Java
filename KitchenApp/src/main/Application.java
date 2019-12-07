package main;
import ingredients.*;
import home.*;

public class Application {

	public static void main(String[] args) {
		Sugar sugar = new Sugar(20);
		Water water = new Water(200);
		CoffeePowder powder = new CoffeePowder(80);
		Coffee coffee = new Coffee(sugar, water, powder);
		Cup cupCoffee = new Cup(coffee);
		Table table = new Table(cupCoffee);
		Kitchen kitchen = new Kitchen(table);
		kitchen.table.cup.coffee.printIngredients();

	}

}


