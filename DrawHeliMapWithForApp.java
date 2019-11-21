package drawHeliMapWithForApp;

public class DrawHeliMapWithForApp {

	public static void main(String[] args) {
		
		final int SCALE  = 10; 
        int hX = 5;
        int hY = 4;

  for(int y=1; y<=SCALE; y++) {
   System.out.printf("%2d. ",y);
   for(int x=1; x<=SCALE; x++) {
       if( x == 1 || y == 1 || x == SCALE || y == SCALE ) {
           System.out.print("# ");
       } else if ( x == hX && y == hY ) {
           System.out.print("H ");
       }else if ( y==hY-1 && x>hX-2 && x<hX+2 || y==hY && x>hX-3 && x<hX+3 || y==hY+1 && x>hX-2 && x<hX+2) {
           System.out.print("x ");
       }else {
           System.out.print("  ");
       }
       
     }
   System.out.println();
  }
      
}
}
	


