package walkingTheDog;

public class Dog extends DogOwner {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		// polymorphism

		super.takeForWalk();
	}

	@Override
	public String toString() {
		return super.toString() + " " + this.name;
	}
}
