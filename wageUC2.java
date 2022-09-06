package day3;

public class wageUC2 {
	
	public static void main(String[] args) {
		int a = 1;
		int RATE = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) %2;
		if (empCheck == a)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * RATE;
		System.out.println("Emp Wage:" + empWage);
	}

}
