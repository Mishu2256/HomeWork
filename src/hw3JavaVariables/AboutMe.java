package hw3JavaVariables;

import org.omg.CORBA.PUBLIC_MEMBER;

public class AboutMe {
	public String firstName;
	//Variable declared

	public String name = "Md Khalequzzman";
	public byte age = 57;
	public short myCarCost = 15000;
	public int myYearlyProfit = 33347268;
	public long myNetIncome = 833720036l;
	public float myHeight = 1.5f;
	public double myGrade = 3.6;
	public char sex = 'M';
	public boolean usCitizen = false;
	//Variable initialized
	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.age);
		System.out.println(aboutMe.sex);
		System.out.println("My Name:" + aboutMe.name + "\nMy Age:" + aboutMe.age + "\nMy Sex:" + aboutMe.sex);
		// method implemented
		// here public is access modifier; void is type of method
		// myInfo name of the method
		public Void myInfo() {
			System.out.println("\n\nHi,im from method of AboutMe class");
			
			//constructor declared
			    public AboutMe() {
			    	System.out.println("this is all about me ---\n")
			    }
		}

	}


