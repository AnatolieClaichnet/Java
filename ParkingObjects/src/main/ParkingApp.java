package main;
import parking.Car;
import parking.Parking;

public class ParkingApp {

	public static void main(String[] args) {
		Car mercedes = new Car("Mercedes", "AB-123");
		Car fiat = new Car("Fiat", "XY-567");
		
		//bmw.printCar();
		
		Parking park = new Parking();
		park.parkCar(mercedes, "1A");
		//park.parkCar(mercedes, "2A");
		//park.parkCar(fiat, "1B");
		//park.parkCar(fiat, "2B");
		//park.parkCar(fiat, "1C");
		park.parkCar(fiat, "2C");
		//park.printFreePlaces();
		park.printMap();

	}

}
