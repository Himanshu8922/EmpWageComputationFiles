package day3;

public class wageUC3 {
	
	public static void main(String[] args) {
		int PART_TIME = 1;
		int FULL_TIME = 2;
		int RATE = 20;
		int empHrs = 0;
		int empWage = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == PART_TIME)
			empHrs = 4;
		else if (empCheck == FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * RATE;
		System.out.println("Emp Wage:" + empWage);
	}

}
