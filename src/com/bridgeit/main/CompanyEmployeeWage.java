package com.bridgeit.main;

public class CompanyEmployeeWage {
	
	
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
		
		public int dailyWageOfEmployee(Company company) {
			int perDaySalary = 0;
			int totalWorkingHours = company.getTotalWorkingHours();
			int wagePerHrs = company.getWagePerHrs();
			perDaySalary = totalWorkingHours * wagePerHrs;
			return perDaySalary;
		}
		
		public int wagesPerMonth(Company company) {
			
			int totalSalaryPerMonth = 0;
			int workingDays = company.getWorkingDays();
			int employeeWorkingDays=0;
			
			for(int i=0;i<workingDays;i++) {
				
				if (presentOrAbsent().equals("present")) {
					employeeWorkingDays = employeeWorkingDays+1;
				}	
			}

			totalSalaryPerMonth = dailyWageOfEmployee(company) * employeeWorkingDays;
			return totalSalaryPerMonth;

		}
	
	

}
