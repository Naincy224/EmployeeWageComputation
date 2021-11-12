package com.bridgeit.main;

public class Company {
	String companyName;
	int totalWorkingHours = 0;
	int wagePerHrs = 0;
	int workingDays = 0;
	
	public Company() {
		
	}
	
	public Company(String companyName, int totalWorkingHours, int wagePerHrs, int workingDays ) {
		this.companyName=companyName;
		this.totalWorkingHours=totalWorkingHours;
		this.wagePerHrs=wagePerHrs;
		this.workingDays=workingDays;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public int getTotalWorkingHours() {
		return totalWorkingHours;
	}
	
	public int getWagePerHrs() {
		return wagePerHrs;
	}
	
	public int getWorkingDays() {
		return workingDays;
	}
	
}
