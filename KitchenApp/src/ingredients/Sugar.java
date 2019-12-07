package ingredients;

public class Sugar {
	int grams;
	
	public Sugar(int grams){
		this.grams = grams;
	}
	
	public void setGrams(int grams) {
		this.grams = grams;
	}
	
	public int getGrams() {
		return this.grams;
	}
	
	public void printSugar() {
		System.out.printf(" * Sugar - %3dgr\n", getGrams());
	}

}
