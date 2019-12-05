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
		//testCase1();
		//Bus.Wheels.setWheelPSI(120, 3);
		//System.out.println(Bus.Wheels.getWheelPSI(Bus.Wheels.BACK_RIGHT_SECONDARY));
		TestWheelsBasic();
		
				

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
	static void TestWheelsBasic(){
		  // 4 working wheels within parameters
		  Bus.Wheels.setWheelPSI(115.0, Bus.Wheels.FRONT_LEFT);
		  Bus.Wheels.setWheelPSI(115.0, Bus.Wheels.FRONT_RIGHT);
		  Bus.Wheels.setWheelPSI(100.0, Bus.Wheels.BACK_LEFT_PRIMARY);
		  Bus.Wheels.setWheelPSI(100.0, Bus.Wheels.BACK_RIGHT_PRIMARY);
		  Bus.Wheels.setWheelPSI(0.0, Bus.Wheels.BACK_LEFT_SECONDARY);
		  Bus.Wheels.setWheelPSI(0.0, Bus.Wheels.BACK_RIGHT_SECONDARY);
		  
		//Bus.setSeats(40);
		//System.out.println( Bus.isGoodToGo() );
		  
		//Bus.setSeats(29);
		//System.out.println( Bus.isGoodToGo() );
		  
		  Bus.Wheels.setWheelPSI(80.0, Bus.Wheels.BACK_LEFT_SECONDARY);
		  Bus.Wheels.setWheelPSI(80.0, Bus.Wheels.BACK_RIGHT_SECONDARY);
		  
		  Bus.setSeats(45);
		  System.out.println( Bus.isGoodToGo() );
		  
	}

}
