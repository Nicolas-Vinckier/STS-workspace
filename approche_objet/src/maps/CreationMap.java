package maps;

import java.util.HashMap;

public class CreationMap {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// User u1 = new User("Paul", 1750);
		// User u2 = new User("Hicham", 1825);
		// User u3 = new User("Yu", 2250);
		// User u4 = new User("Ingrid", 2015);
		// User u5 = new User("Chantal", 2418);

		HashMap<String, Integer> map = new HashMap<>();
		// association d'une clé à chaque élément
		map.put("Paul", 1750);
		map.put("Hicham", 1825);
		map.put("Yu", 2250);
		map.put("Ingrid", 2015);
		map.put("Chantal", 2418);

		System.out.println(map.size());

	}
}
