package doctor;

public class SetPerson {
	public SetPerson() {
		// create instance of the class

		Person person1 = new Person();

		person1.setId(1);
		person1.setFirstName("Whitney");
		person1.setLastName("Houston");
		// print out first and last name of person

		System.out.println(person1.getFirstName() + " " + person1.getLastName());
		// create second instance of the class

		Person person2 = new Person();

		person2.setId(2);
		person2.setFirstName("George");
		person2.setLastName("Michael");

		// print out first and last name of person

		System.out.println(person2.getFirstName() + " " + person2.getLastName());

		// create third instance of class

		Person person3 = new Person();

		person3.setId(3);
		person3.setFirstName("Iva");
		person3.setLastName("Ivić");
		// print out first and last name of person

		System.out.println(person3.getFirstName() + " " + person3.getLastName());
	}

	public static void main(String[] args) {
		new SetPerson();
	}

}
