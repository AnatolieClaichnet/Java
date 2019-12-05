package garage;

public class Bus {
	final static int MAX_SEATS = 45;
	private static int routeNumber = 77;  //77, 88, 99
	private static int seats = 22;
	
	public static class LEDPanel{
		public static void showRoute(){
			System.out.println("##########");
			System.out.printf("#   %d   #\n",Bus.routeNumber);
			System.out.println("##########");
	}
	}
	
	//getters & setters
	public static int getRouteNumber(){
		return routeNumber;
	}
	
	public static void setRouteNumber(int routeNumber){
		if(routeNumber!=77 && routeNumber!=88 && routeNumber!=99){
			System.err.print("Error");
			
		}else{
			Bus.routeNumber = routeNumber;
		}
		
	}
	public static int getSeats(){
		return seats;
	}
	
	public static void setSeats(int seats){
		if(seats>45 || seats<0){
			System.err.print("Error\n");
			
		}else{
			Bus.seats = seats;
		}
	}
	
	public static void enterPassenger(int enter){
		if(seats + enter<MAX_SEATS){
			if(enter == 1 || enter ==2){
				Bus.seats += enter;
			}
		}
	} 
	
	public static void exitPassenger(int exit){
		if(seats - exit>=0){
			if(exit == 1 || exit ==2){
				Bus.seats -= exit;
			}
		}
	} 
	public static class Wheels {
        // Wheel numeric identifiers
       public final static int FRONT_LEFT = 1;
       public final static int FRONT_RIGHT = 2;
       public final static int BACK_LEFT_PRIMARY = 3;
       public final static int BACK_LEFT_SECONDARY = 4;
       public final static int BACK_RIGHT_PRIMARY = 5;
       public final static int BACK_RIGHT_SECONDARY = 6;
        
      private static double frontLeftPSI = 100.0;
      private static double frontRightPSI = 100.0;
      private static double backLeftPrimaryPSI = 100.0;
      private static double backLeftSecondaryPSI = 100.0;
      private static double backRightPrimaryPSI = 100.0;
      private static double backRightSecondaryPSI = 100.0;
        
       public static void setWheelPSI(double pressure, int whichWheel) {
        	if(whichWheel>0 && whichWheel<7) {
        		if(pressure>=0) {
        			if(whichWheel==FRONT_LEFT && pressure<=120.0) {
        				Wheels.frontLeftPSI = pressure;
        			}else if(whichWheel==FRONT_RIGHT && pressure<=120.0) {
        				Wheels.frontRightPSI = pressure;
        			}else if(whichWheel==BACK_LEFT_PRIMARY && pressure<=100.0) {
        				Wheels.backLeftPrimaryPSI = pressure;
        			}else if(whichWheel==BACK_LEFT_SECONDARY && pressure<=80.0) {
        				Wheels.backLeftSecondaryPSI = pressure;
        			}else if(whichWheel==BACK_RIGHT_PRIMARY && pressure<=100.0) {
        				Wheels.backRightPrimaryPSI = pressure;
        			}else if(whichWheel==BACK_RIGHT_SECONDARY && pressure<=80.0) {
        				Wheels.backRightSecondaryPSI = pressure;
        			}else {
        				System.err.println("To hight pressure");
        			}
        		
        		}else {
        			System.err.println("To low pressure") ;
        			
        		}
        	}else {
        		System.err.println("Tray again wheel");
        	}
        } 
       
      public static double getWheelPSI(int whichWheel) {
    	   double pressure = 0;
    	  switch(whichWheel) {
    	   case 1:
    		   pressure = frontLeftPSI;
    		   break;
    	   case 2:
    		   pressure = frontRightPSI;
    		   break;
    	   case 3:
    		   pressure = backLeftPrimaryPSI;
    		   break;
    	   case 4:
    		   pressure = backLeftSecondaryPSI;
    		   break;
    	   case 5:
    		   pressure = backRightPrimaryPSI;
    		   break;
    	   case 6:
    		   pressure = backRightSecondaryPSI;
    		   break;
    	 	   }
    	   return pressure;
       }
      
	}
	
     public static boolean isGoodToGo() {
    	  
    	  boolean y  = false;
     		
    	  		if(seats>=30) {
   	  		
		       	boolean frontWheelsCase1 = (Wheels.getWheelPSI(Wheels.FRONT_LEFT ) > 114 && Wheels.getWheelPSI(Wheels.FRONT_RIGHT ) > 114); 
		       	boolean primaryWheelsCase1 = (Wheels.getWheelPSI(Wheels.BACK_LEFT_PRIMARY) > 95 && Wheels.getWheelPSI(Wheels.BACK_RIGHT_PRIMARY) > 95);
		     	boolean secondaryWheelsCase1 = (Wheels.getWheelPSI(Wheels.BACK_LEFT_SECONDARY) > 76 && Wheels.getWheelPSI(Wheels.BACK_RIGHT_SECONDARY) > 76);
		     	
		     	y = (frontWheelsCase1 && primaryWheelsCase1 && secondaryWheelsCase1);		
		     	
    	  		}else if(seats < 30) {
    	  			boolean frontWheelsCase2 = (Wheels.getWheelPSI(Wheels.FRONT_LEFT ) > 114 && Wheels.getWheelPSI(Wheels.FRONT_RIGHT ) > 114);
    	  			boolean primaryWheelsCase2 = (Wheels.getWheelPSI(Wheels.BACK_LEFT_PRIMARY) > 95 && Wheels.getWheelPSI(Wheels.BACK_RIGHT_PRIMARY) > 95);
    	  			
    	  			y = (frontWheelsCase2 && primaryWheelsCase2);
    	  		}
    		  	  
    	 return y;
      
        
	}

}
