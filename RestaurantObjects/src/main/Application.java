package main;
import world.Person;
import restaurant.Table;
import restaurant.Restaurant;

public class Application {

	public static void main(String[] args) {
		Person person1 = new Person("Stirbu Elena", 'f', 28);
		Person person2 = new Person("Rosca Ion", 'm', 29);
		Person person3 = new Person("Rosca Ilie", 'm', 22);
		
		//person1.printInfo();
		Table table1 = new Table(1);
		Table table2 = new Table(2);
		Table table3 = new Table(3);
		
		table1.setSeat(person1, 'A');
		table1.setSeat(person2, 'B');
		table2.setSeat(person3, 'B');
		//table1.printInfo();
		Restaurant restaurant = new Restaurant("RESTAURANT: Good Morning Sunshine!");
		restaurant.setTable(table1, 1);
		restaurant.setTable(table2, 2);
		restaurant.setTable(table3, 3);
		restaurant.printInfo();

	}
}
