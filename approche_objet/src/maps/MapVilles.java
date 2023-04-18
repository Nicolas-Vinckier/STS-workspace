package maps;

import java.util.HashMap;
import java.util.Map;

import listes.Ville;

public class MapVilles {
	public static void main(String[] args) {
		// Création d'une HashMap pour stocker les villes et leur nombre d'habitants
		HashMap<String, Integer> mapVilles = new HashMap<>();

		// Création des objets Ville
		Ville Marseille = new Ville("Marseille", 853000);
		Ville Montpellier = new Ville("Montpellier", 290000);
		Ville Nantes = new Ville("Nantes", 313000);
		Ville Paris = new Ville("Paris", 2181000);
		Ville Toulouse = new Ville("Toulouse", 479000);
		Ville Lille = new Ville("Lille", 232000);
		Ville Lyon = new Ville("Lyon", 515695);
		Ville Bordeaux = new Ville("Bordeaux", 255000);

		// Ajout des villes et de leur nombre d'habitants dans la HashMap
		mapVilles.put(Marseille.getNomVille(), Marseille.getNbHabitants());
		mapVilles.put(Montpellier.getNomVille(), Montpellier.getNbHabitants());
		mapVilles.put(Nantes.getNomVille(), Nantes.getNbHabitants());
		mapVilles.put(Paris.getNomVille(), Paris.getNbHabitants());
		mapVilles.put(Toulouse.getNomVille(), Toulouse.getNbHabitants());
		mapVilles.put(Lille.getNomVille(), Lille.getNbHabitants());
		mapVilles.put(Lyon.getNomVille(), Lyon.getNbHabitants());
		mapVilles.put(Bordeaux.getNomVille(), Bordeaux.getNbHabitants());

		// Affichage de la HashMap avant la suppression
		System.out.println(mapVilles);

		/* Les commentaires ci dessous sont en dessous les lignes de codes*/

		String villeMoinsHabitants = null;
		// Déclaration d'une variable de type String pour stocker le nom de la ville
		// avec le moins d'habitants, initialisée à null.
		int minHabitants = Integer.MAX_VALUE;
		// Déclaration d'une variable de type int pour stocker le nombre d'habitants
		// minimum, initialisée à la valeur maximale possible pour un int.

		// Recherche de la ville avec le moins d'habitants
		for (Map.Entry<String, Integer> entry : mapVilles.entrySet()) {
			// Boucle sur chaque entrée (clé-valeur) de la map mapVilles.
			if (entry.getValue() < minHabitants) {
				// Comparaison du nombre d'habitants de l'entrée actuelle avec la valeur
				// minimale actuelle.
				minHabitants = entry.getValue();
				// Si le nombre d'habitants de l'entrée actuelle est inférieur à la valeur
				// minimale actuelle, on met à jour la valeur minimale.
				villeMoinsHabitants = entry.getKey();
				// On met à jour le nom de la ville avec le moins d'habitants avec la clé de
				// l'entrée actuelle.
			}
		}

		// Suppression de la ville avec le moins d'habitants
		if (villeMoinsHabitants != null) {
			// Vérification si le nom de la ville avec le moins d'habitants n'est pas null,
			// c'est-à-dire si une ville avec le moins d'habitants a été trouvée.
			mapVilles.remove(villeMoinsHabitants);
			// Suppression de la ville avec le moins d'habitants de la map en utilisant son
			// nom comme clé.
			System.out.println("Ville supprimée : " + villeMoinsHabitants);
			// Affichage du nom de la ville supprimée.
		}

		// Affichage de la HashMap après la suppression
		System.out.println("Après suppression : " + mapVilles);
	}
}
