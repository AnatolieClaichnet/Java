package ingredients;

public class Water {
	int mililiters;
	
	public Water(int mililiters){
		this.mililiters = mililiters;
	}
	
	public void setMililiters(int mililiters) {
		this.mililiters = mililiters;
	}
	
	public int getMililiters() {
		return this.mililiters;
	}
	
	public void printWater() {
		System.out.printf(" * Water - %2dml\n", getMililiters());
	}

}
