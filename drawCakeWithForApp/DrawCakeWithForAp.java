package drawCakeWithForApp;
import java.util.Scanner;

public class DrawCakeWithForAp {

	public static void main(String[] args) {
		
			final int SMOKE  = 1; 
			final int FIRE   = 2; 
			final int CANDLE = 3; 
			final int CREAM  = 4; 
			final int BASE   = 5; 
			
			System.out.println("Enter the Cake width");
			Scanner in = new Scanner(System.in);
			int widthCake = in.nextInt();

	       for(int level=1; level<=5 ;level++) {
	           switch(level) {
	               case SMOKE:
	            	   for(int i=1; i<=2; i++) {
	            	   for(int elements=1; elements<=widthCake; elements++) {
                           System.out.print(".");
                       }
	            	   System.out.println();
	            	   }
	            	   break;
	               case FIRE: 
	            	   for(int elements=1; elements<=widthCake; elements++) {
                           System.out.print("^");
                       }
	            	   System.out.println();
	            	   break;
	               case CANDLE:
	            	   for(int elements=1; elements<=widthCake; elements++) {
                           System.out.print("|");
                       }
	            	   System.out.println();
	            	   break;
	               case CREAM: 
	            	   for(int elements=1; elements<=widthCake; elements++) {
                           System.out.print("~");
                       }
	            	   System.out.println();
	            	   break;
	               case BASE:
	                    for(int lines=1; lines<=3; lines++) {
	                        for(int elements=1; elements<=widthCake; elements++) {
	                            System.out.print("#");
	                        }
	                        System.out.println();
	                    }
	               break;
	           }
	       }

	}

}
