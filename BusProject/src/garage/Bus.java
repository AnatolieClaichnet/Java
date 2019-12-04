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
	

}
