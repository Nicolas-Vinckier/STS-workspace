package maps;

import java.util.HashMap;
import java.util.Map;

import listes.Ville;

public class MapVilles {
	public static void main(String[] args) {
		HashMap<String, Integer> mapVilles = new HashMap<>();
		Ville Marseille = new Ville("Marseille", 853000);
		Ville Montpellier = new Ville("Montpellier", 290000);
		Ville Nantes = new Ville("Nantes", 313000);
		Ville Paris = new Ville("Paris", 2181000);
		Ville Toulouse = new Ville("Toulouse", 479000);
		Ville Lille = new Ville("Lille", 232000);
		Ville Lyon = new Ville("Lyon", 515695);
		Ville Bordeaux = new Ville("Bordeaux", 255000);

		mapVilles.put(Marseille.getNomVille(), Marseille.getNbHabitants());
		mapVilles.put(Montpellier.getNomVille(), Montpellier.getNbHabitants());
		mapVilles.put(Nantes.getNomVille(), Nantes.getNbHabitants());
		mapVilles.put(Paris.getNomVille(), Paris.getNbHabitants());
		mapVilles.put(Toulouse.getNomVille(), Toulouse.getNbHabitants());
		mapVilles.put(Lille.getNomVille(), Lille.getNbHabitants());
		mapVilles.put(Lyon.getNomVille(), Lyon.getNbHabitants());
		mapVilles.put(Bordeaux.getNomVille(), Bordeaux.getNbHabitants());

		System.out.println(mapVilles);

		String villeMoinsHabitants = null;
		int minHabitants = Integer.MAX_VALUE;

		for (Map.Entry<String, Integer> entry : mapVilles.entrySet()) {
			if (entry.getValue() < minHabitants) {
				minHabitants = entry.getValue();
				villeMoinsHabitants = entry.getKey();
			}
		}

		// Supprimer la ville avec le moins d'habitants
		if (villeMoinsHabitants != null) {
			mapVilles.remove(villeMoinsHabitants);
			System.out.println("Ville supprimée : " + villeMoinsHabitants);

		}
		System.out.println("Après suppression : " + mapVilles);
	}

}
