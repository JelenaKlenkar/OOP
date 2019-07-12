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

		// print the first name of the patient

		System.out.println(patient.getFirstName());
	}

}
