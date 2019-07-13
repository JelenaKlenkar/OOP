package doctor;

public class SetPatient {
	public static void main(String[] args) {
		// create new object -instance of the class
		Patient patient = new Patient();

		patient.setId(1);
		patient.setFirstName("George");
		patient.setLastName("Michael");
		patient.setSupplementalHealthInsurance(true);
		patient.setNumberOfHealthInsuranceCard(123456789);

		// print out the first name of the patient

		System.out.println(patient.getFirstName());

		// create second instance of the class

		Patient p = new Patient();

		p.setId(2);
		p.setFirstName("Nina");
		p.setLastName("Badriæ");
		p.setSupplementalHealthInsurance(true);
		p.setNumberOfHealthInsuranceCard(235478123);

		// print out if the patient has supplemental health insurance

		System.out.println(p.isSupplementalHealthInsurance());
	}

}
