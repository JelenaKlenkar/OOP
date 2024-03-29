package consoleApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
	private List<Person> persons;

	public Start() {
		persons = new ArrayList<>();

		main_loop: while (true) {
			menu();
			switch (Helper.enterInteger("Enter number of action")) {
			case 5:
				break main_loop;
			case 1:
				listPerson();
				break;
			case 2:
				persons.add(enterperson());
				break;
			case 3:
				editPerson();
				break;
			case 4:
				deletePerson();
				break;
			default:
				break;

			}
		}

	}

	private void deletePerson() {
		listPerson();
		Person p = persons.get(ordinalNumberOfPerson() - 1);
		persons.remove(p);
	}

	private void editPerson() {
		listPerson();
		Person p = persons.get(ordinalNumberOfPerson() - 1);
		System.out.println(p);
		p = setValues(p);

	}

	private int ordinalNumberOfPerson() {
		int on;
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ordinal number");
			on = sc.nextInt();
			if (on > persons.size()) {
				System.out.println("Select ordinal number");
				continue;
			}
			return on;
		}

	}

	private Person enterperson() {
		Person p = new Person();
		p = setValues(p);
		return p;
	}

	private void listPerson() {
		System.out.println("\n List of persons");
		int i = 0;
		for (Person person : persons) {
			System.out.println(++i + "." + person);

		}
		System.out.println();

	}

	private Person setValues(Person p) {
		p.setFirstName(Helper.enterString("Enter first name: "));
		p.setLastName(Helper.enterString("Enter last name: "));
		p.setHeight(Helper.enterInteger("Enter height: "));
		p.setDateOfBirth(Helper.enterDate("Enter date of birth: "));
		return p;
	}

	private void menu() {
		System.out.println("#Console application#");
		System.out.println("1.List all person");
		System.out.println("2.Enter new person");
		System.out.println("3.Edit person");
		System.out.println("4.Delete person");
		System.out.println("5.Exit program");

	}

	public static void main(String[] args) {
		new Start();
	}
}
