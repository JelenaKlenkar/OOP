package consoleApplication;

import java.util.Date;

public class Person {
	// private fields
	private String firstName;
	private String lastName;
	private int height;
	private Date dateOfBirth;

	// default constructor
	public Person() {

	}

	// parameterized constructor

	public Person(String firstName, String lastName, int height, Date dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.height = height;
		this.dateOfBirth = dateOfBirth;
	}

	// public methods
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return getFirstName() + " " + getLastName();
	}

}
