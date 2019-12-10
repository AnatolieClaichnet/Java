package main;
import collections.SimpleList;

public class Application {

	public static void main(String[] args) {
			
		SimpleList sList = new SimpleList();
		 sList.add( 10 );
		 sList.add( 20 );
		 sList.add( 30 );
		 System.out.println("The list has " + sList.getLength()  + " elements" );
		 
		 sList.print();
		 sList.get(1);

	}

}
