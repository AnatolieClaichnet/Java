package packUnpackDataApp;
import java.util.Scanner;

public class PackUnpackDataApp {

	public static void main(String[] args) {
		String a = packIntegers(10, 20, 10);
		unpackIntegers(a);

	}
	static String packIntegers(int a, int b, int c) {
	    return "" + a + " " + b + " " + c;
	}
	static void unpackIntegers(String data) {
	    Scanner in = new Scanner(data);
	    int a = in.nextInt();
	    int b = in.nextInt();
	    int c = in.nextInt();
	    System.out.println( "a = " + a );
	    System.out.println( "b = " + b );
	    System.out.println( "c = " + c );
	}

}
