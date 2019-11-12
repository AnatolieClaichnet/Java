package typeCasting;

public class Exercise2 {

	public static void main(String[] args) {
		int distanceBetweenCitiesMiles = 200;
		int vitezaAutomobil = 160;  //km/h
		double distanceBetweenCitiesKilometres = distanceBetweenCitiesMiles/0.62137;
		int travelPeriodHours = (int)distanceBetweenCitiesKilometres/vitezaAutomobil;
		int rest = (int)distanceBetweenCitiesKilometres%vitezaAutomobil;
		int restTimeMinute = rest/vitezaAutomobil*60;
		System.out.println("The road takes " + travelPeriodHours+"h " + restTimeMinute +"m");
		
	}

}
