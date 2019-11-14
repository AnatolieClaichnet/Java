package ageCalculatorApp;
import java.util.*;

public class AgeCalculatorApp {

	public static void main(String[] args) {
		
		final int anulCurent = 2019; 
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Intoduceti anul nasterii");
		int anulNasterii = scann.nextInt();
		scann.close();
		int virsta = anulCurent-anulNasterii;
		System.out.println("Aveti virsta de " + virsta + " ani");
		
		

	}

}
