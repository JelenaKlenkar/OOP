package doctor;

public class SetNurse {
	public SetNurse() {

		// create an object

		Nurse nurse = new Nurse();

		nurse.setPersonalIdentificationNumber(14567898);

		// create second instance of the class

		Nurse n = new Nurse();

		n.setPersonalIdentificationNumber(24567891);

	}

	public static void main(String[] args) {

		new SetNurse();
	}
}
