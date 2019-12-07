package ingredients;

public class CoffeePowder {
	int grams;
	
	public CoffeePowder(int grams){
		this.grams = grams;
	}
	
	public void setGrams(int grams) {
		this.grams = grams;
	}
	
	public int getGrams() {
		return this.grams;
	}
	
	public void printCoffeePowder() {
		System.out.printf(" * Powder - %2dgr\n", getGrams());
	}

}
