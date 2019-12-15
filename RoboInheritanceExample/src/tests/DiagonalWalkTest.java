package tests;

import robo.*;

public class DiagonalWalkTest {
	public static int runCase(CharlieRobot robot){
        int percentage = 0;    

        /// VALUES

        // name cannot be null
        robot.setName(null);
        if( robot.getName() == null ) {
            System.err.println("Name test failed\nREASON: null name not allowed!");
            return percentage;
        }
        percentage+=10;

        // model cannot be null
        robot.setModel(null);
        if( robot.getModel() == null ) {
            System.err.println("Model test failed\nREASON: null model not allowed!");
            return percentage;
        }
        percentage+=10;

        /// COORDINATES

        // X cannot be outside 0..100
        robot.setX(-100);
        if( robot.getX() < 0 ) {
            System.err.println("X coord test failed\nREASON: Values less than 0 not allowed!");
            return percentage;
        }
        percentage+=10;
        
        // X cannot be outside 0..100
        robot.setX(1000);
        if( robot.getX() > 100 ) {
            System.err.println("X coord test failed\nREASON: Values more than 100 not allowed!");
            return percentage;
        }
        percentage+=10;

        // Y cannot be outside 0..100
        robot.setY(-100);
        if( robot.getY() < 0 ) {
            System.err.println("Y coord test failed\nREASON: Values less than 0 not allowed!");
            return percentage;
        }
        percentage+=5;

        // Y cannot be outside 0..100
        robot.setY(1000);
        if( robot.getY() > 100 ) {
            System.err.println("Y coord test failed\nREASON: Values more than 100 not allowed!");
            return percentage;
        }
        percentage+=5;

        /// MOVEMENT

        // Y cannot be outside 0..100
        robot.setY(0);
        if( robot.moveUp() ) {
            System.err.println("Move test failed\nREASON: moveUp() out of bounds!");
            return percentage;
        }
        percentage+=5;

        // Y cannot be outside 0..100
        robot.setY(100);
        if( robot.moveDown() ) {
            System.err.println("Move test failed\nREASON: moveDown() out of bounds!");
            return percentage;
        }
        percentage+=5;

        // X cannot be outside 0..100
        robot.setX(0);
        if( robot.moveLeft() ) {
            System.err.println("Move test failed\nREASON: moveleft() out of bounds!");
            return percentage;
        }
        percentage+=10;

        // X cannot be outside 0..100
        robot.setX(100);
        if( robot.moveRight() ) {
            System.err.println("Move test failed\nREASON: moveRight() out of bounds!");
            return percentage;
        }
        percentage+=10;
        
     // set charge -100
        robot.setCharge((byte)-100);
        if(robot.getCharge()>100 || robot.getCharge()<0 ) {
            System.err.println("Charge test failed\nREASON: charge can't be > 100 or < 0!");
            return percentage;
        }
        percentage+=5;
        
        // set charge 1000
        robot.setCharge((byte)1000);
        if(robot.getCharge()>100 || robot.getCharge()<0 ) {
            System.err.println("Charge test failed\nREASON: charge can't be > 100 or < 0!");
            return percentage;
        }
        percentage+=5;
        
        robot.setCharge((byte)50);
        for(int i=0; i<=100;i++) {
        	if(robot.moveLeft() != false) {
        		robot.moveLeft();
        		}else {
        			break;
        		}
        }
        
        if(robot.getCharge()!=5) {
        	System.err.println("Charge test failed\nREASON: charge must be 5!");
	            return percentage;
        }
        percentage+=5;
        
        robot.setCharge((byte)50);
        for(int i=0; i<=100;i++) {
        	if(robot.moveUpRight() != false) {
        		robot.moveUpRight();
        		}else {
        			break;
        		}
        }
        
        if(robot.getCharge()!=5) {
        	//System.out.println(robot.getCharge());
        	  System.err.println("Charge test failed\nREASON: charge must be 5!");
	            return percentage;
        }
        percentage+=5;

        return percentage;
    }


}
