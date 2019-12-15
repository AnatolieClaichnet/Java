package tests;
import robo.BetaRobot;

public class ChargeTest{
	 public static int runCase(BetaRobot robot){
	        int percentage = 0;    


	        // set charge -100
	        robot.setCharge((byte)-100);
	        if(robot.getCharge()>100 || robot.getCharge()<0 ) {
	            System.err.println("Charge test failed\nREASON: charge can't be > 100 or < 0!");
	            return percentage;
	        }
	        percentage+=30;
	        
	        // set charge 1000
	        robot.setCharge((byte)1000);
	        if(robot.getCharge()>100 || robot.getCharge()<0 ) {
	            System.err.println("Charge test failed\nREASON: charge can't be > 100 or < 0!");
	            return percentage;
	        }
	        percentage+=30;
	        
	        robot.setCharge((byte)50);
	        for(int i=0; i<=100;i++) {
	        	if(robot.moveRight() != false) {
	        		robot.moveRight();
	        		}else {
	        			break;
	        		}
	        	
	        }
	        if(robot.getCharge()!=5) {
	        	  System.err.println("Charge test failed\nREASON: charge must be 5!");
		            return percentage;
	        }
	        percentage+=40;
	        return percentage;
	 }
	
}
