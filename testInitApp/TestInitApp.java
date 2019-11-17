package testInitApp;

public class TestInitApp {

	public static void main(String[] args) {
		
		        float x = 0.5f;
		        float y = 0.25f	;
		        float z;     
		        if ( x >= 0 ) {
		             z = x * y;
		        } else {
		             z = x / y;
		        }
		        System.out.printf( "(%f,%f) -> %f", x,y,z );		        
			
	}

}
