package doctor;

public class SetTreatment {

	public static void main(String[] args) {
		// create new object

		Treatment treatment = new Treatment();

		treatment.setDiagnosis("Gastritis");
		treatment.setMedicine("Controloc");

		// create second instance of the class

		Treatment t = new Treatment();

		t.setDiagnosis("Cistitis");
		t.setMedicine("Nolicin");

		// print out the medicine

		System.out.println(t.getMedicine());
	}

}
