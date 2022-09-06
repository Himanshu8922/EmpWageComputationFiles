
public class whileUC6 {
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	public static final int RATE =20;
	public static final int WORKING_DAYS = 2;
	public static final int HRS_IN_MONTH = 10;
	
	public static void main(String[] args) {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while (totalEmpHrs <= HRS_IN_MONTH &&
				totalWorkingDays < WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			 case PART_TIME:
				empHrs = 4;
				break;
			 case FULL_TIME:
				empHrs = 8;
				break;
			 default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#:" + totalWorkingDays + " Emp Hr: " +empHrs);
		}
		int totalEmpWage = totalEmpHrs * RATE;
		System.out.println("Total Emp Wage:" + totalEmpWage);
	}
}
