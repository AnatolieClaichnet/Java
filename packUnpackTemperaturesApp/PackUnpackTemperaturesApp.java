package packUnpackTemperaturesApp;
import java.util.Scanner;

public class PackUnpackTemperaturesApp {

	public static void main(String[] args) {
		
		System.out.println(unpackTemperatures(packTemperatures(5, -4, 2, 1, -2, 8, 4 )));
		//System.out.println(packTemperatures(5, 4, 20, 1, 2, 80, 5));

	}
	static int numTempValues;
	static String packTemperatures(int ...t) {
		String str = "";
		for(int i : t) {
			str += i + " ";				
		}
		numTempValues = t.length;
		return str;
		
	}
	static int avgTemperature(int...t) {
		int len = t.length;
		int sum = 0;
		for(int i : t) {
			sum +=i;				
		}
		return sum / len;
	}
	static int unpackTemperatures(String data) {
		Scanner in = new Scanner(data);
		int[] temValues = new int[numTempValues]; 
		for(int i=0; i<numTempValues; i++) {
			temValues[i] = in.nextInt();
		}
		return avgTemperature(temValues);
		
	}

}
