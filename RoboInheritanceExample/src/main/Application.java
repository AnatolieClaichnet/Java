package main;
import robo.*;
import tests.*;

public class Application {

	public static void main(String[] args) {
		
		//System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
		//System.out.printf( "Charge test passed %d%%\n", ChargeTest.runCase( new BetaRobot("Robo","beta") ) );
		//System.out.printf( "Diagonal walk test %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Robot","Charlie") ) );
		AbstractRobot robo = RobotFactory.getRobot("beta","Bobo"); 
		((BetaRobot) robo).setCharge((byte)50);
		System.out.println(((BetaRobot) robo).moveDown());
		
	}

}
