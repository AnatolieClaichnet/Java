package parking;

public class Parking {
	private byte freePlaces; 
    private Car place1A;
    private Car place1B;
    private Car place1C;
    private Car place2A;
    private Car place2B;
    private Car place2C;
    
    public Parking() {
    	this.freePlaces = (byte)6;
    }
    
    public void parkCar(Car c,String place) {
    	if(place == "1A" && this.place1A == null) {
    		 this.place1A = c;
    	}else if(place == "1B" && this.place1B == null) {
    		this.place1B = c;
    	}else if(place == "1C" && this.place1C == null) {
    		this.place1C = c;
    	}else if(place == "2A" && this.place2A == null) {
    		this.place2A = c;
    	}else if(place == "2B" && this.place2B == null) {
    		this.place2B = c;
    	}else if(place == "2C" && this.place2C == null) {
    		this.place2C = c;
    	}else {
    		
    	}
    }
    
    public void printFreePlaces() {
    	System.out.println(freePlaces);
    }
    
    public void printMap() {
    	System.out.printf("---------------------\n|");
    	if(place1A == null) {
    		System.out.print(" 0 ")	;
    	}else {
    		place1A.printCarModel();
    	}
     	System.out.printf("|");
     	if(place2A == null) {
    		System.out.printf(" %-8s", "0" );
    	}else {
    		place2A.printCarModel();
    	}
    	System.out.printf("|\n|");
    	if(place1A == null) {
    		System.out.print("       ")	;
    	}else {
    		place1A.printCarId();
    	}
    	System.out.printf("  |");
    	if(place2A == null) {
    		System.out.print("       ")	;
    	}else {
    		place2A.printCarId();
    	}
     	System.out.printf("  |");
    	System.out.print("\n---------------------\n");
    	System.out.print("---------------------\n|");
    	if(place1B == null) {
    		System.out.printf(" %-8s", "0" );
    	}else {
    		place1B.printCarModel();
    	}
     	System.out.printf("|");
     	if(place2B == null) {
     		System.out.printf(" %-8s", "0" );
    	}else {
    		place2B.printCarModel();
    	}
    	System.out.printf("|\n|");
    	if(place1B == null) {
    		System.out.print("       ")	;
    	}else {
    		place1B.printCarId();
    	}
    	System.out.printf("  |");
    	if(place2B == null) {
    		System.out.print("       ")	;
    	}else {
    		place2B.printCarId();
    	}
    	System.out.printf("  |");
    	System.out.print("\n---------------------\n");
    	System.out.print("---------------------\n|");
    	if(place1C == null) {
    		System.out.printf(" %-8s", "0" );
    	}else {
    		place1C.printCarModel();
    	}
     	System.out.printf("|");
     	if(place2C == null) {
     		System.out.printf(" %-8s", "0" );
    	}else {
    		place2C.printCarModel();
    	}
    	System.out.printf("|\n|");
    	if(place1C == null) {
    		System.out.print("       ")	;
    	}else {
    		place1C.printCarId();
    	}
    	System.out.printf("  |");
    	if(place2C == null) {
    		System.out.print("       ")	;
    	}else {
    		place2C.printCarId();
    	}
    	System.out.printf("  |");
    	System.out.print("\n---------------------\n");
    	
    	
    }
}
