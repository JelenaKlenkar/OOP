package doctor;

public class Patient extends Person {

	// 1.OOP principle is encapsulation

	private boolean supplementalHealthInsurance;
	private int numberOfHealthInsuranceCard;

	// public methods

	public boolean isSupplementalHealthInsurance() {
		return supplementalHealthInsurance;
	}

	public void setSupplementalHealthInsurance(boolean supplementalHealthInsurance) {
		this.supplementalHealthInsurance = supplementalHealthInsurance;
	}

	public int getNumberOfHealthInsuranceCard() {
		return numberOfHealthInsuranceCard;
	}

	public void setNumberOfHealthInsuranceCard(int numberOfHealthInsuranceCard) {
		this.numberOfHealthInsuranceCard = numberOfHealthInsuranceCard;
	}

}
