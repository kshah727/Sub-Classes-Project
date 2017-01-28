package com.sqa.ks;

public interface IFaculty extends IEmployee {

	public void attendFacultyMeeting();

	public abstract void meetWithStudent(String ID);

	String getSchoolDistrict();

	String setSchoolDistrict(String district);
}
