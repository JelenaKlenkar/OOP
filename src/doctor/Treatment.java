package doctor;

public class Treatment {

	// encapsulation (include 1.private fields and 2.public methods)

	// 1.private fields
	private String diagnosis;
	private String medicine;

	// 2. public methods
	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

}
