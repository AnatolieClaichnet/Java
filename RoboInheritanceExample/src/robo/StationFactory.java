package robo;

public class StationFactory {
	public static ChargingStation Station(int x, int y ) {
	
	return new ChargingStation(x, y);
	}
}
