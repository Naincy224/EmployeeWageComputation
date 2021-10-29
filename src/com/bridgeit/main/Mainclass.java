package com.bridgeit.main;

public class Mainclass {

	public static void main(String[] args) {

		EmpWageComput empObj = new EmpWageComput();

		empObj.printWelcomeMessage();
		String presentOrAbsent=empObj.presentOrAbsent();
		System.out.println("The employee is : "+presentOrAbsent);
		System.out.println("The per day total salary of this employee is :  "+empObj.dailyWageOfEmployee(presentOrAbsent));
		
	}

}
