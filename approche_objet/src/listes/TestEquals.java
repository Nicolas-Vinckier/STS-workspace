package listes;

public class TestEquals {

	public static void main(String[] args) {

		Ville Villeagois1 = new Ville("Marseille", 1000);
		Ville Villeagois2 = new Ville("Paris", 1000);

		if (Villeagois1.getNbHabitants().equals(Villeagois2.getNbHabitants())) {
			System.out.println("Les deux villes sont identiques.");
		} else {
			System.out.println("Les deux villes sont différentes.");
		}

		// if (Villeagois1.getNbHabitants() == Villeagois2.getNbHabitants()) {
		// System.out.println("Les deux villes sont identiques.");
		// } else {
		// System.out.println("Les deux villes sont différentes.");
		// }
	}

}
