package com.bridgeit.main;

public class Mainclass {

	public static void main(String[] args) {

		EmpWageComput empObj = new EmpWageComput();

		empObj.printWelcomeMessage();
		String presentOrAbsent=empObj.presentOrAbsent();
		System.out.println("The employee is : "+presentOrAbsent);
		System.out.println("The per day total salary of this employee is :  "+empObj.dailyWageOfEmployee(presentOrAbsent));
		empObj.SwitchEmployeeFunction("dailyWageOfEmployee");
		int wagesPerMont=empObj.wagesPerMonth();
		System.out.println("The per month total salary of employee is : "+wagesPerMont);
		
		//Wage calculation for different companies
		Company amazon = new Company("Amazon", 7, 100, 20);
		Company tcs= new Company("TCS", 8, 80, 18);
		Company bridgeLabs= new Company("BridgeLabs", 10, 200, 22);
		CompanyEmployeeWage employeWage = new CompanyEmployeeWage();
		System.out.println("This month salary of this employee working in "+tcs.getCompanyName()+" is:"+employeWage.wagesPerMonth(tcs));
		System.out.println("This month salary of this employee working in "+amazon.getCompanyName()+" is:"+employeWage.wagesPerMonth(amazon));
		System.out.println("This month salary of this employee working in "+bridgeLabs.getCompanyName()+" is:"+employeWage.wagesPerMonth(bridgeLabs));
	}

}
