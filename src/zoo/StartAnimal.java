package zoo;

public class StartAnimal {
	public static void main(String[] args) {
		// create an instance of class

		Animal animal = new Animal();

		animal.setId(1);
		animal.setName("Eagle");
		animal.setNumberOfLegs(2);

		System.out.println("Id of animal: " + animal.getId());
		System.out.println("Name of animal: " + animal.getName());
		System.out.println("Number of legs: " + animal.getNumberOfLegs());

	}

}
