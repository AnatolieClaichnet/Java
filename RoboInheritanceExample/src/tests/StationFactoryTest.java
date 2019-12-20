package tests;

import robo.BetaRobot;
import robo.ChargingStation;

public class StationFactoryTest {
	

	 public static int runCase(BetaRobot robot, ChargingStation station){
	        int percentage = 0;
	        
	        robot.setCharge(50);
	       // System.out.println(robot.getCharge());
	        station.setCharge(100);
	        
	        for(int i = 0; i < 20; i++) {
	        robot.moveDown();
	        robot.moveRight();
	        }
	        station.charge(robot);
	        //System.out.println(robot.getCharge());
	        if(station.getCharge()!=100) {
	        	System.err.println("Charge test failed\nREASON: can't charge robot with other location that station location!");
	            return percentage;
	        }
	        percentage+=30;
	        	       			
	        robot.setCharge(50);
	        for(int i = 10; i > 0; i--) {
		        robot.moveUp();
		        robot.moveLeft();
		        }
	       // System.out.println(robot.getCharge());
	        station.charge(robot);
	       // System.out.println(station.getCharge());
	        
	       // System.out.println(robot.getX());
	        if(robot.getCharge()!= 100) {
	        	System.err.println("Charge test failed\nREASON: robot don't charge");
	        	return percentage;
	        }
		        	percentage += 30;
	        
		       if( station.charge(robot) == true) {
		    	   System.err.println("Charge test failed\nREASON: Is not posible to charge a full charged battery");
		        	return percentage;
		       }
	              
	        	percentage += 40;
	        
	        return percentage;
		        
	 }

}
