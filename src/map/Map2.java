package map;

import java.util.Hashtable;
import java.util.Map;

public class Map2 {
	public Map2() {

		// create a hashTable of numbers

		Map<Integer, String> numbers = new Hashtable<Integer, String>();

		numbers.put(1, "one");
		numbers.put(2, "two");

	}

	public static void main(String[] args) {
		new Map2();
	}
}
