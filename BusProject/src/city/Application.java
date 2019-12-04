package city;
import garage.*;

public class Application {

	public static void main(String[] args) {
		//System.out.println(Bus.getSeats());
		//Bus.LEDPanel.showRoute();
		//Bus.setRouteNumber(98);
		//Bus.LEDPanel.showRoute();
		//Bus.setSeats(66);
		
		//Bus.enterPassenger(2);
		//Bus.exitPassenger(1);
		//System.out.println(Bus.getSeats());
		testCase1();
		
		

	}
	
	public static void testCase1(){
		Bus.setSeats(40);
		Bus.enterPassenger(5);
		Bus.enterPassenger(2);
		Bus.enterPassenger(2);
		Bus.enterPassenger(2);
		Bus.exitPassenger(50);
		Bus.exitPassenger(1);
		System.out.println(Bus.getSeats());
		
		
		
		
		
	}

}
