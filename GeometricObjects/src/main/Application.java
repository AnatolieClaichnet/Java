package main;
import geometry.Line;

public class Application {

	public static void main(String[] args) {
		Line line = new Line(10, 20, 30, 40);
		line.printCoords();
		System.out.println(line.length());
		testA();
		testB();
		

	}
	
	public static void testA() {
		Line short_horizontal_line = new Line(100, 0, 200, 0);
	      short_horizontal_line.printCoords();
	      System.out.println( short_horizontal_line.length() );
	}
	
	public static void testB() {
		Line long_diagonal_line = new Line( 100,100, 500,500 );
	      long_diagonal_line.printCoords();
	      System.out.println( long_diagonal_line.length() );
	}

}
