package weatherProvider;
import java.util.Random;

public class WeatherProvider {
	private static double temperatureForToday = generateTemperature();
    private static double[] temperaturesFor10Days = generateTemperaturesForecastFor10Days();

    private static double generateTemperature() {
        Random rd = new Random(); 
        double temperature = Math.round(300 * 10 * ( rd.nextDouble() - 0.5 ))/10d;
        return temperature;
    }

    private static double[] generateTemperaturesForecastFor10Days() {
    	double [] temperatures = new double[10];
    	for(int i=0; i<10; i++) {
    		temperatures[i] = generateTemperature();
    	}
        return temperatures;
    }  


    public static double getTemperatureForToday() {
        return  temperatureForToday;
    }

    public static double[] getTemperaturesForecastFor10Days() {
    	return temperaturesFor10Days;
    }

    public static double calculateAvgFor10Days() {
    	double sumTemperatures = 0;
        for(double t : temperaturesFor10Days) {
        	sumTemperatures +=t;
        }
        return sumTemperatures/10;
    }

    public static double getMaxTemperatureFor10Days() {
        double maxTemperature = temperaturesFor10Days[0];
        for(double t : temperaturesFor10Days) {
        	if(t> maxTemperature)
        		maxTemperature = t;
        }
        return maxTemperature;
    }

    public static double getMinTemperatureFor10Days() {
    	double minTemperature = temperaturesFor10Days[0];
        for(double t : temperaturesFor10Days) {
        	if(t< minTemperature)
        		minTemperature = t;
        }
        return minTemperature;
    }
}
