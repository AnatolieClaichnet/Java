package main;
import weatherProvider.WeatherProvider;

public class WeatherApplication {

	public static void main(String[] args) {
		printWeather();
		

	}
	
	public static void printWeather() {
       System.out.printf("########## WEATHER ##########\n\n");
       System.out.printf("TODAY: %.1f %c\n\n",WeatherProvider.getTemperatureForToday(), '\u2103' );
       System.out.printf("----------------------------\n");
       System.out.printf("FORECAST FOR 10 DAYS\n");
       
       for(int i=0, j=1; i<10; i++, j++) {
    	   System.out.printf("DAY %2d: %6.1f %c\n", j,WeatherProvider.getTemperaturesForecastFor10Days()[i],  '\u2103' );   
    	  }
       
       System.out.printf("\nMAX: %9.1f %c\n",WeatherProvider.getMaxTemperatureFor10Days(), '\u2103' );
       System.out.printf("AVG: %9.1f %c\n",WeatherProvider.calculateAvgFor10Days(), '\u2103' );
       System.out.printf("MIN: %9.1f %c\n\n",WeatherProvider.getMinTemperatureFor10Days(), '\u2103' );
       System.out.printf("############################");
    }

}
