package typeCasting;

public class Banca {

	public static void main(String[] args) {
		int moneyFirstPerson = 100;
		int moneySecondPerson = 200;
		int moneyThirdPerson = 300;
		int moneyAccumulator = 0;
		int expensesBudget = 45;
		moneyAccumulator += moneyFirstPerson;
		moneyAccumulator += moneySecondPerson;
		moneyAccumulator += moneyThirdPerson;
		moneyAccumulator -= expensesBudget;
		System.out.println("  " + moneyAccumulator + "MDL:" + "\n"+ "  " + 
		moneyFirstPerson + "MDL" + "\n" + "+ " + moneySecondPerson + "MDL" + "\n" + 
		"+ " + moneyThirdPerson + "MDL" + "\n" + "--------" + "\n" + "- " + expensesBudget + "MDL");
		

	}

}
