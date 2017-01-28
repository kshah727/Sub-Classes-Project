package com.sqa.ks;

public class Faculty extends Employee implements IFaculty {

	/**
	 * @see com.sqa.ks.IFaculty#attendFacultyMeeting()
	 */
	@Override
	public void attendFacultyMeeting() {
		// TODO Auto-generated method stub
		System.out.println(getClass().getSimpleName() + "attends meeting.");
	}

	/**
	 * @see com.sqa.ks.IFaculty#getSchoolDistrict()
	 */
	@Override
	public String getSchoolDistrict() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see com.sqa.ks.IFaculty#meetWithStudent(java.lang.String)
	 */
	@Override
	public void meetWithStudent(String ID) {
		// TODO Auto-generated method stub
	}

	/**
	 * @see com.sqa.ks.IFaculty#setSchoolDistrict(java.lang.String)
	 */
	@Override
	public String setSchoolDistrict(String district) {
		// TODO Auto-generated method stub
		return null;
	}
	// private boolean
	// private
	// private
}
