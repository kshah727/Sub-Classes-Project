package com.sqa.ks;

public class Governmental extends Employee {

	private int employeeId;

	@Override
	public double calcRate() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Person working in govt does not want to do work");
	}

	@Override
	public int getEmployeeId() {
		return this.employeeId;
	}

	@Override
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Override
	public void takeBreak() {
		System.out.println("Govt employeeid takes break");
	}
}
