package main;
import robo.*;
import tests.*;

public class Application {

	public static void main(String[] args) {
		
		//System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
		//System.out.printf( "Charge test passed %d%%\n", ChargeTest.runCase( new BetaRobot("Robo","beta") ) );
		//System.out.printf( "Diagonal walk test %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Robot","Charlie") ) );
		AbstractRobot robo = RobotFactory.getRobot("beta","Bobo"); 
		BetaRobot robot = (BetaRobot) robo;
		//((BetaRobot) robo).setX(10);
		//((BetaRobot) robo).setY(10);
		//((BetaRobot) robo).setCharge(50);
		//System.out.println(((BetaRobot) robo).getCharge());
		//System.out.println(((BetaRobot) robo).moveDown());
		//System.out.println(((BetaRobot) robo).moveRight());
		//HasBatteryInterface robot = 
		ChargingStation station = StationFactory.Station(10, 10); 
		System.out.printf("Test passed on %d%s\n",StationFactoryTest.runCase(robot, station), "%");
		System.out.printf("Station Charge %d%s \n", station.getCharge(), "%");
	}

}
