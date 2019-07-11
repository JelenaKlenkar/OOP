package doctor;

public class Treatment extends Patient{
	
	//encapsulation
	
	private String diagnosis;
	private String medicine;
	
	//public methods
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
