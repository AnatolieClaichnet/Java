package drawLineWithForApp;
import java.util.Scanner; 

public class DrawLineWithForApp {

	public static void main(String[] args) {
		char direction;
        byte length;
        
        System.out.println("Enter line length");
        Scanner in = new Scanner(System.in);
        length = in.nextByte();
        
        System.out.println("Enter line direction");
        direction = in.next().charAt(0);
        
        switch(direction){
        	case 'h': 
        	for(int i=1;i<=10;i++) {
        		System.out.print("-");
        		if(i==length) {
        			break;
        		}        		         
            }
        	break;
        	case 'v':
        		for(int i=1;i<=10;i++) {
            		System.out.println("|");
            		if(i==length) {
            			break;
            		}        		         
                }
        }
  	}

}
