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


    public static double getTemperatureForToday() throws TemperatureDataOutOfRangeException {
    	if(temperatureForToday>152 || temperatureForToday<-152) {
    		throw new TemperatureDataOutOfRangeException();
    	}
    	if(temperatureForToday>150 && temperatureForToday<153) { 
        return  temperatureForToday-2;
    	}else if(temperatureForToday<-150 && temperatureForToday>-153) {
    		return  temperatureForToday+2;
    	}
       	return  temperatureForToday;
    	
    }

    public static double[] getTemperaturesForecastFor10Days() throws TemperatureDataOutOfRangeException {
    	double [] adjustedTemperatFor10Days = new double[10];
    	for(int i=0; i<10; i++) {
    		if(temperaturesFor10Days[i]>152 || temperaturesFor10Days[i]<-152) {
    			throw new TemperatureDataOutOfRangeException();
    		}
    		if(temperaturesFor10Days[i]>150 && temperaturesFor10Days[i]<153) { 
    			adjustedTemperatFor10Days[i] = temperaturesFor10Days[i]-2;
    		}else if(temperaturesFor10Days[i]<-150 && temperaturesFor10Days[i]>-153) { 
    			adjustedTemperatFor10Days[i] = temperaturesFor10Days[i]+2;
    		}else {
    			adjustedTemperatFor10Days[i] = temperaturesFor10Days[i];
    		}
    			
        }
    	return adjustedTemperatFor10Days;
    }

    public static double calculateAvgFor10Days() throws TemperatureDataOutOfRangeException {
    	double sumTemperatures = 0;
        for(double t : temperaturesFor10Days) {
        	sumTemperatures +=t;
        }
        if((sumTemperatures/10>152) || (sumTemperatures/10<-152)) {
    		throw new TemperatureDataOutOfRangeException();
    	}
        if((sumTemperatures/10>150) && (sumTemperatures/10<153)) 
            return  sumTemperatures/10-2;
        
        if((sumTemperatures/10<-150) && (sumTemperatures/10>-153))
            return  sumTemperatures/10+2;
        
        return sumTemperatures/10;
    }

    public static double getMaxTemperatureFor10Days() throws TemperatureDataOutOfRangeException{
        double maxTemperature = temperaturesFor10Days[0];
        for(double t : temperaturesFor10Days) {
        	if(t> maxTemperature)
        		maxTemperature = t;
        }
        if((maxTemperature>152) || (maxTemperature<-152)) {
    		throw new TemperatureDataOutOfRangeException();
    	}
        if(maxTemperature>150 && maxTemperature<153)
            return  maxTemperature-2;
        
        if(maxTemperature<-150 && maxTemperature>-153)
            return  maxTemperature+2;
        
        return maxTemperature;
    }

    public static double getMinTemperatureFor10Days() throws TemperatureDataOutOfRangeException{
    	double minTemperature = temperaturesFor10Days[0];
        for(double t : temperaturesFor10Days) {
        	if(t< minTemperature)
        		minTemperature = t;
        }
        if((minTemperature>152) || (minTemperature<-152) ) {
    		throw new TemperatureDataOutOfRangeException();
    	}
        if(minTemperature>150 && minTemperature<153)
            return  minTemperature-2;
        
        if(minTemperature<-150 && minTemperature>-153)
            return  minTemperature+2;
        
        return minTemperature;
    }
}
