package restaurant;
import world.Person;


public class Table {
	
	private	int number;
	private Person seatA;
	private Person seatB;

	
	
	public Table(int number) {
		if(number == 1 || number == 2 || number == 3) {
			this.number = number;
		}else {
			System.err.println("ERROR");
		}
	  }      
	
	public void setNumber(int number) {
		if(number == 1 || number == 2 || number == 3) {
			this.number = number;
		}
	}
	
	public void setSeat(Person seat, char a) {
		if(a == 'A') {
			this.seatA = seat;
		}else if(a == 'B') {
			this.seatB = seat;
		}
	}
	
	public boolean isFree() {
		boolean x = false;
		if(seatA == null && seatB == null) {
			x = true;
		}
		return x;
	}
	
	public Person getSeat(char z) {
		Person x = null;
		if(z == 'A') {
			x = this.seatA;
		}else if(z == 'B') {
			x =  this.seatB;
		}
		return x;
	}
	
	public void printInfo(){
		System.out.printf("Table: %d\n", this.number);
		if(getSeat('A') == null && getSeat('B') == null) {
			System.out.printf("A) Free seat\n");
			System.out.printf("B) Free seat\n");
		}else if(getSeat('A') != null && (getSeat('B') != null)) {
			System.out.print("A) ");
			seatA.printInfo();
			System.out.print("B) ");
			seatB.printInfo();
		}else if(getSeat('B') == null) {
			System.out.print("A) ");
			seatA.printInfo();
			System.out.printf("B) Free seat\n");
		}else {
			System.out.printf("A) Free seat\n");
			System.out.print("B) ");
			seatB.printInfo();
		}
		
	}
	
	
}
