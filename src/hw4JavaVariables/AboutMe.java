package hw4JavaVariables;

public class AboutMe {
	// variable is declared
	public String name;
	public byte age;
	public short myCarCost;
	public int myYearlyProfit;
	public long myNetIncome;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;

	public aboutMe() {
		System.out.println("This is all about us");
	}

	public void aboutMe() {
		System.out.println("My Name: " + name + "\nMy Age: " + age + "\nMy CarCost: " + myCarCost
				+ "\nMy YearlyProfit: " + myYearlyProfit + "\nMy NetIncome :" + myNetIncome + "\nMy Height: " + myHeight
				+ "\nMy Grade: " + myGrade + "\nMy Sex: " + sex + "\nAm I US Citizen: " + usCitizen);

	}
}
