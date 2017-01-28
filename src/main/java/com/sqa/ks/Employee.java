package com.sqa.ks;

public class Employee extends Person implements IEmployee {

	private String dateOfHire;

	private boolean isSalaryBased;

	private boolean isContract;

	private String jobTitle;

	private double hourlyRate;

	private double salaryRate;

	private int employeeId;

	public Employee() {
		this.jobTitle = "Unemployed";
		this.dateOfHire = "01/01/2017";
		this.isSalaryBased = false;
		this.isContract = false;
		this.salaryRate = 0.0;
		this.hourlyRate = 0.0;
	}

	public Employee(String dateOfBirth, String name, char gender, String jobTitle,
			String dateOfHire, boolean isSalaryBased, boolean isContract, double salaryRate,
			double hourlyRate) {
		super(dateOfBirth, name, gender);
		this.jobTitle = jobTitle;
		this.dateOfHire = dateOfHire;
		this.isSalaryBased = isSalaryBased;
		this.isContract = isContract;
		this.salaryRate = salaryRate;
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calcRate() {
		double rate;
		if (this.isSalaryBased) {
			rate = this.salaryRate / 2080;
		} else {
			rate = this.hourlyRate;
		}
		return rate;
	}

	/**
	 * @see com.sqa.ks.IEmployee#doWork()
	 */
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName() + "does work");
	}

	public String getDateOfHire() {
		return this.dateOfHire;
	}

	@Override
	public int getEmployeeId() {
		return this.employeeId;
	}

	/**
	 * @see com.sqa.ks.IEmployee#getEmployeeId()
	 */
	public double getHourlyRate() {
		return this.hourlyRate;
	}

	public String getJobTitle() {
		return this.jobTitle;
	}

	public double getSalaryRate() {
		return this.salaryRate;
	}

	public boolean isContract() {
		return this.isContract;
	}

	public boolean isSalaryBased() {
		return this.isSalaryBased;
	}

	public void setContract(boolean isContract) {
		this.isContract = isContract;
	}

	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}

	@Override
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setSalaryBased(boolean isSalaryBased) {
		this.isSalaryBased = isSalaryBased;
	}

	public void setSalaryRate(double salaryRate) {
		this.salaryRate = salaryRate;
	}

	/**
	 * @see com.sqa.ks.IEmployee#takeBreak()
	 */
	@Override
	public void takeBreak() {
		// TODO Auto-generated method stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("They were hired on ");
		builder.append(this.dateOfHire);
		builder.append(". They're hourly rate is ");
		builder.append(this.calcRate());
		if (this.isContract) {
			builder.append("They are on a contract.");
		}
		if (this.isSalaryBased) {
			builder.append("They are salary based.");
		} else {
			builder.append("They are paid per hour.");
		}
		return builder.toString();
	}
}
