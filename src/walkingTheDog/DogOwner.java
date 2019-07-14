package walkingTheDog;

public class DogOwner {

	// private fields

	private int id;
	private String firstName;
	private String lastName;

	// public methods
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
	
	//declare a method with no return no parameters
	public void takeForWalk() {
		
		
	}

	@Override
	public String toString() {
		return this.firstName + this.lastName;
	}

}
