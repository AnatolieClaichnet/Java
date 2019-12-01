package temperatureMeteoApp;
import java.util.Random;

public class TemperatureMeteoApp {

	public static void main(String[] args) {
		
		System.out.printf("Temperature %.1f degree C\n", PrivateMeteoProvider.getCurrentTemperature(818));
		System.out.printf("Humidity %d%c", PrivateMeteoProvider.getCurrentHumidity(818), '%');

	}

}
class OpenMeteoProvider {
	static int codeBelgium = 056;
	static int codeAustralia = 036;
	static int codeEgypt = 818;
	static int codeGreece = 300;
	static int codeMoldova = 498;
	
    static double getCurrentTemperature( int countryCode ){
      Random random = new Random();
      double x = -50 + random.nextDouble()*100;
      if(countryCode!=codeBelgium  & countryCode!=codeAustralia & countryCode!=codeEgypt & 
    		  countryCode!=codeGreece & countryCode!=codeMoldova) {
    	  System.err.print("Can't provide data for this country!");
      }else {
    	  return x; 
      }
      return 0;
      	
    }
 }

class PrivateMeteoProvider extends OpenMeteoProvider{
	static byte getCurrentHumidity( int countryCode ) {
		Random random = new Random();
		byte y = (byte)random.nextInt(100);
		if(countryCode!=codeBelgium  & countryCode!=codeAustralia & countryCode!=codeEgypt & 
	    		  countryCode!=codeGreece & countryCode!=codeMoldova) {
	    	  System.err.print("Can't provide data for this country!");
	      }else {
	    	  return y; 
	      }
	      return 0;
	}
}







