package doctor;

public class SetNurse {
	public SetNurse() {

		// create an object

		Nurse nurse = new Nurse();

		nurse.setFirstName("Whitney");
		nurse.setLastName("Houston");
		nurse.setPersonalIdentificationNumber(14567898);

		// print out first and last name of nurse

		System.out.println(nurse.getFirstName() + " " + nurse.getLastName());

		// create second instance of the class

		Nurse n = new Nurse();

		n.setFirstName("Iva");
		n.setLastName("Iviæ");
		n.setPersonalIdentificationNumber(24567891);

		// print out first and last name of nurse

		System.out.println(n.getFirstName() + " " + n.getLastName());
	}

	public static void main(String[] args) {

		new SetNurse();
	}
}
