package doctor;

public class Patient {
	//1.OOP principle is encapsulation
	
	private int id;
	private String firstName;
	private String lastName;
	private boolean supplementalHealthInsurance;
	private int numberOfHealthInsuranceCard;
	
	//public methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
