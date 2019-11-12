package typeCasting;

public class Exercise3 {

	public static void main(String[] args) {
		int theoryHours = 100;
		int successfulExercises = 75;
		int notaExamen = 8;
		
		boolean certified1 = theoryHours >= 100;
		boolean certified2 = successfulExercises >= 70*120/100;
		boolean certified3 = notaExamen >= 7;
		boolean certified = certified1 && certified2 && certified3;
		
		System.out.println("Certified " + certified + "!" );

	}	

}
