package zoo;

public class Bird extends Animal {

	private String reproduction;
	private String outerCovering;

	public String getReproduction() {
		return reproduction;
	}

	public void setReproduction(String reproduction) {
		this.reproduction = reproduction;
	}

	public String getOuterCovering() {
		return outerCovering;
	}

	public void setOuterCovering(String outerCovering) {
		this.outerCovering = outerCovering;
	}

//polymorphism(overloading)
	public void move() {
		System.out.println("The bird is moving by flying.");
	}

	public void move(int height) {
		System.out.println("The bird is flying" + height + "feet high");
	}
}