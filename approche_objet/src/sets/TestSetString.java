package sets;

import java.util.HashSet;

public class TestSetString {

	public static void main(String[] args) {
		int NombreLettre = 0;
		String nom = "";

		// Instanciation d'un HashSet vide
		HashSet<String> Pays = new HashSet<>();

		// Ajout d'éléments à l'ensemble
		Pays.add("USA");
		Pays.add("France");
		Pays.add("Allemagne");
		Pays.add("UK");
		Pays.add("Italie");
		Pays.add("Japon");
		Pays.add("Chine");
		Pays.add("Russie");
		Pays.add("Inde");

		for (String pays : Pays) {
			System.out.println(pays);
			if (pays.length() > NombreLettre) {
				NombreLettre = pays.length();
				nom = pays;
			} else {

			}
		}

		System.out.println("------ Big Pays ------");
		System.out.println(NombreLettre);
		System.out.println(nom);

		// Supprimer le pays aillant le plus de lettre
		Pays.remove(nom);
		System.out.println(Pays);
	}

}
