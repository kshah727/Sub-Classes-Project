package com.sqa.ks;

public interface IEmployee {

	public abstract double calcRate();

	public int getEmployeeId();

	public void setEmployeeId(int employeeId);

	public void takeBreak();

	void doWork();
}
