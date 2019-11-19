package pinCodeApp;
import java.util.Scanner;

public class PinCodeApp {

	public static void main(String[] args) {
		final short CORRECT_PIN = 1234;
        short pin = 0000;
        byte tries = 0;
        
        System.out.println("INTRODUCE YOUR PASSWORD");
        Scanner in = new Scanner(System.in);
        pin = in.nextShort();
        
        while( pin != CORRECT_PIN ) {
        	 tries++;
        	 if(tries==3) {
         		System.out.println("MANY TRIES!");
         		break;
             }
        	System.out.println("TRY AGAIN!");
            pin = in.nextShort(); 
         
             }
        
        if (pin>=1000 && pin<=9999 && pin==CORRECT_PIN) {
        	System.out.println("ACCESS GRANTED!");
        }        
               
	}

}
