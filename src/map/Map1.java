package map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public Map1() {
		// create a HashMap object called capitalCities that will store String keys and
		// String values:
		Map<String, String> capitalCities = new HashMap<>();

		// add keys and values

		capitalCities.put("London", "England");
		capitalCities.put("Zagreb", "Croatia");
		capitalCities.put("Paris", "France");

		// Print keys and values

		for (String i : capitalCities.keySet()) {
			System.out.println("key: " + i + " " + "value: " + capitalCities.get(i));

		}

	}

	public static void main(String[] args) {
		new Map1();
	}

}
