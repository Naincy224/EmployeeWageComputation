package com.bridgeit.main;

public class EmpWageComput {

	public void printWelcomeMessage() {

		System.out.println("Welcome to Employee Wage Computation Program");

	}

	// Adding presentAbsent functionality for UC1 and UC7
	public String presentOrAbsent() {
		double randomNum = Math.floor(Math.random() * 10) % 2;
		String absentPresent;
		if (randomNum == 0) {
			absentPresent = "absent";
		} else {
			absentPresent = "present";

		}

		return absentPresent;
	}

	// Adding dailywage of employee functionality for UC2 and UC7
	public int dailyWageOfEmployee(String presentOrAbsent) {
		int totalSalary = 0;
		int totalWorkingHours = 8;
		int wagePerHrs = 20;
		if (presentOrAbsent.equals("present")) {
			totalSalary = totalWorkingHours * wagePerHrs;
		}
		return totalSalary;

	}

//Adding switch case for the funcationalities for UC4 and UC7
	public void SwitchEmployeeFunction(String switchToOn) {

		switch (switchToOn) {

		case "presentOrAbsent":
			System.out.println(presentOrAbsent());
			break;
		case "printWelcomeMessage":
			printWelcomeMessage();
			break;
		case "dailyWageOfEmployee":
			System.out.println(dailyWageOfEmployee(presentOrAbsent()));
			break;

		default:
			System.out.println(
					"Please Enter a valid Switch which are 'presentOrAbsent','printWelcomeMessage','dailyWageOfEmployee'");
		}
	}
	//Adding wages per month functionality for UC5 and UC7
	public int wagesPerMonth() {
		
		int totalSalaryPerMonth = 0;
		int totalWorkingHours = 8;
		int wagePerHrs = 20;
		int workingDays = 0;
		
		for(int i=0;i<20;i++) {
			
			if (presentOrAbsent().equals("present")) {
				workingDays = workingDays+1;
			}	
		}

		totalSalaryPerMonth = totalWorkingHours * wagePerHrs * workingDays;
		return totalSalaryPerMonth;

	}
}
