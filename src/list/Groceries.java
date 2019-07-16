package list;

import java.util.ArrayList;
import java.util.List;

public class Groceries {

	public Groceries() {

		// declare an array of groceries

		Grocery[] groceries = new Grocery[3];

		// create 3 instances and add them to an array

		Grocery grocery1 = new Grocery();

		grocery1.setName("Bread");
		grocery1.setAmount(2);

		groceries[0] = grocery1;

		Grocery grocery2 = new Grocery();
		grocery2.setName("Milk");
		grocery2.setAmount(4);

		groceries[1] = grocery2;

		Grocery grocery3 = new Grocery();
		grocery3.setName("Oil");
		grocery3.setAmount(3);
		groceries[2] = grocery3;

		// print out all of the groceries in an array Grocery

		for (Grocery grocery : groceries) {
			System.out.println(grocery.getName());

			// create an array list of groceries

			List<Grocery> grocerylist = new ArrayList<>();

			// add an elements to an ArrayList

			grocerylist.add(grocery1);
			grocerylist.add(grocery2);
			grocerylist.add(grocery3);

		}

	}

	public static void main(String[] args) {
		new Groceries();
	}
}
