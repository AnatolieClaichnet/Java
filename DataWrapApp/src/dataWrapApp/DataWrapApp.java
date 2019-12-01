package dataWrapApp;

public class DataWrapApp {

	public static void main(String[] args) {
		
		System.out.println(dataWrapper.wrapSquare("array"));
		System.out.println(dataWrapper.wrapAngle("tag"));
		System.out.println(dataWrapper.wrapRound(0.5));
	}

}

class dataWrapper{
	static String wrapRound(String text) {
		return "("+text+")";
	}
	static String wrapRound(char a) {
		return "("+a+")";
	}
	static String wrapRound(double x) {
		return "("+x+")";
	}
	static String wrapSquare(String text){
		return "["+text+"]";
	}
	static String wrapSquare(char a) {
		return "("+a+")";
	}
	static String wrapSquare(double x) {
		return "("+x+")";
	}
	static String wrapAngle(String text){
		return "<"+text+">";
	}
	static String wrapAngle(char a) {
		return "("+a+")";
	}
	static String wrapAngle(double x) {
		return "("+x+")";
	}
}