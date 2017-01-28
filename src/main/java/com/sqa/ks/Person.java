package com.sqa.ks;

public class Person {

	private String name;

	private String dateOfBirth;

	private char gender;

	public Person() {
		this.dateOfBirth = "01/01/2017";
		this.name = "John Doe";
		this.gender = 'M';
	}

	public Person(String dateOfBirth, String name, char gender) {
		super();
		this.dateOfBirth = dateOfBirth;
		this.name = name;
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public char getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String pronoun;
		StringBuilder builder = new StringBuilder();
		builder.append("This person's name is ");
		builder.append(this.name);
		pronoun = (this.gender == 'F') ? "she" : "he";
		builder.append(",");
		builder.append(pronoun);
		builder.append(" was born on ");
		builder.append(this.dateOfBirth);
		builder.append(".");
		return builder.toString();
	}
}
