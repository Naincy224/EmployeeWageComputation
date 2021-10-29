package com.bridgeit.main;

public class EmpWageComput {

	public void printWelcomeMessage() {

		System.out.println("Welcome to Employee Wage Computation Program");

	}

	// Adding presentAbsent functionality for UC1
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

}
