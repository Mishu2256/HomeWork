package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		// constructor is initialized
		AboutMe mishu = new AboutMe();
		// variable is initialized
		mishu.name = "Md Khalequzzman";
		mishu.age = 30;
		mishu.myCarCost = 15000;
		mishu.myYearlyProfit = 33347268;
		mishu.myNetIncome = 833720036l;
		mishu.myHeight = 5.5f;
		mishu.myGrade = 3.6;
		mishu.sex = 'M';
		mishu.usCitizen = false;
		mishu.aboutMe();// method is initialized.

		AboutMe alex = new AboutMe();
		alex.name = "Md Alex";
		alex.age = 29;
		alex.myCarCost = 20000;
		alex.myYearlyProfit = 6000000;
		alex.myNetIncome = 456789999l;
		alex.myHeight = 5.9f;
		alex.myGrade = 2.2;
		alex.sex = 'M';
		alex.usCitizen = true;
		alex.aboutMe();

	}

}