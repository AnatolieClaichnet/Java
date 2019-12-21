package office;

public class Office {
	
	final static int TOP    = 0;
	final static int MIDDLE = 1;
	final static int BOTTOM = 2;
	
	private static Object[] cabinet = {
	          null,
	          null,
	          null
	  };
	
	static boolean put(int shelf, Object thing) {
		boolean x = false;
		if(cabinet[shelf] == null) {
			cabinet[shelf]= thing;
			x = true;;
		}
		return x;
	}
	
	
	public static void printCabinet() {
		
		for(int i = 0; i < 7; i++ ) {
			for(int j = 0; j < 20; j++ ) { 
				if(i==1 && j==2 && cabinet[0] != null) {
					System.out.printf(" %-16s %s",cabinet[0],"#");
				}else if(i==3 && j==2 && cabinet[1] != null) {
					System.out.printf(" %-16s %s",cabinet[1],"#");
				}else if(i==5 && j==2 && cabinet[2] != null) {
					System.out.printf(" %-16s %s",cabinet[2],"#");
				}else if(i%2!=0 && (j==0 /*|| j==19*/) ) {
					System.out.printf("#");
				}else if(i%2 == 0) {
					System.out.printf("#");
				}else{
					System.out.printf("%s", "" );
				}
			}
			System.out.println();
			
		}
	}
		
	public static void main(String[] args) {
		put(0, "Book");
		put(1, "Ball");
		put(2, "Pen");
		put(1,"Orange");
		printCabinet();
		

	}

}
