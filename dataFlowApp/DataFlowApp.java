package dataFlowApp;

public class DataFlowApp {

	public static void main(String[] args) {
		//System.out.println(DataTransformer.integerToByte(1777));
		//System.out.println(DataTransformer.byteToInteger((byte)1));
		//System.out.println(DataTransformer.doubleToInteger(-2147483649d));
		//System.out.println(DataTransformer.integerToDouble(14748364));
		//System.out.println(DataTransformer.shortToInteger((short)300));
		//System.out.println(DataTransformer.integerToShort(300000));
		System.out.println(DataTransformer.doubleToShort(1.5d));

	}

}

class DataTransformer {
	static byte integerToByte( int value ) {
		if(value>127 || value<-128) {
			System.err.println("WARNING! the value " + value + " overflows byte range. DATA will was lost! ");	
		}
			return (byte)value;
	}
	
	static int byteToInteger( byte value ) {
		return value;
	}
	
	static int doubleToInteger( double value ) {
		if(value>2147483647 || value<-2147483648) {
			System.err.println("WARNING! the value " + value + " overflows integer  range. DATA will was lost! ");	
		}
			return (int)value;
	}
	
	static double integerToDouble( int value ) {
		return (double)value;
	}
	
	static int shortToInteger( short value ) {
		return value;
	}
	
	static short integerToShort( int value ) {
		if(value>32767 || value<-32768) {
			System.err.println("WARNING! the value " + value + " overflows short  range. DATA will was lost! ");	
		}
			return (short)value;
	}
	
	static int doubleToShort( double value ) {
		if(value>32767 || value<-32768) {
			System.err.println("WARNING! the value " + value + " overflows short  range. DATA will was lost! ");	
		}
			return (short)value;
	}
	

}