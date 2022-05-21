package hw5Q2Constructor;

public class Computer {
	public String comBrand;
	public String comModel;
	public String comOperatingSystem;
	public short comPrice;
	public char comGrade;
	public boolean comMadeInUSA;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class");
	}

	public Computer (String comBrand, String comModel, String comOperatingSystem, short comPrice, char comGrade,
			boolean comMadeInUSA) {
		this.comBrand = comBrand;
		this.comModel = comModel;
		this.comOperatingSystem = comOperatingSystem;
		this.comPrice = comPrice;
		this.comGrade = comGrade;
		this.comMadeInUSA = comMadeInUSA;
		System.out.println("this Computer brand is:" + comBrand + "Computer Model:" + comModel
				+ "Computer OperatingSystem is:" + comOperatingSystem + "Computer Price:" + comPrice + "Computer Grade:"
				+ comGrade + "Computer MadeIn:" + comMadeInUSA);

	}
	

	}


