package doctor;

public class SetPatient {
	public static void main(String[] args) {
		// create new object -instance of the class
		Patient patient = new Patient();

		patient.setSupplementalHealthInsurance(true);
		patient.setNumberOfHealthInsuranceCard(123456789);

		// create second instance of the class

		Patient p = new Patient();

		p.setSupplementalHealthInsurance(true);
		p.setNumberOfHealthInsuranceCard(235478123);

		// print out if the patient has supplemental health insurance

		System.out.println(p.isSupplementalHealthInsurance());
	}

}
