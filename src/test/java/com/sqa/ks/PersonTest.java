package com.sqa.ks;

import org.junit.*;

public class PersonTest {

	@Test
	public void testAllEmployees() {
		IEmployee[] employees = new Employee[4];
		employees[0] = new Faculty();
		employees[1] = new Governmental();
		employees[2] = new Teacher();
		employees[3] = new Counselor();
		for (int i = 0; i < employees.length; i++) {
			employees[i].doWork();
		}
		System.out.print("\n");
	}

	@Test
	public void testAllFaculty() {
		IFaculty[] faculty = new Faculty[3];
		faculty[0] = new Faculty();
		faculty[1] = new Counselor();
		faculty[2] = new Teacher();
		for (int i = 0; i < faculty.length; i++) {
			faculty[i].attendFacultyMeeting();
		}
		System.out.println("\n");
	}

	@Test
	@Ignore
	public void testArgPerson() {
		Person person = new Person("07/27/1992", "KS", 'F');
		System.out.println(person);
	}

	@Test
	@Ignore
	public void testDefaultPerson() {
		Person person = new Person();
		System.out.println(person);
	}

	@Test
	@Ignore
	public void testEmployee() {
		Person person = new Employee();
		System.out.println("person hourly rate is" + ((Employee) person).calcRate());
		System.out.println(person);
	}
}
