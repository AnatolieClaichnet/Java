package currencyConverter;
import java.util.*;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		double exchangeRate$InLei = 17.5159;
		Scanner scann = new Scanner(System.in);
		System.out.println("> How much money do you have (USD)?");
		double money$ = scann.nextDouble();
		scann.close();
		double moneyLei = money$*exchangeRate$InLei;
		System.out.printf("> This is equivalent to %.2f MDL" , moneyLei );

	}

}
