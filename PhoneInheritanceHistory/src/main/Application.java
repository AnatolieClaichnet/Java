package main;
import collections.SimplePositiveQueue;
public class Application {

	public static void main(String[] args) {
		SimplePositiveQueue spq = new SimplePositiveQueue();
		spq.push(1000);
		spq.push(2000);
		spq.push(3000);
		
		
		
		if( !spq.push(4000) ){
		  System.out.println("The queue is full!!");
		}
		
	int value;
		do{
		  value = spq.poll();
		  System.out.println( value );
		}while( value!= -1 );

	}

}
