package listes;

import java.util.ArrayList;
import java.util.List;

public class Ville {
	private String nomVille;
	private int nbHabitants;

	// Constructeur
	public Ville(String nomVille, int nbHabitants) {
		this.nomVille = nomVille;
		this.nbHabitants = nbHabitants;
	}

	// Getter ville
	public String getNomVille() {
		return nomVille;
	}

	// Setter ville
	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	// Getter hab
	public int getNbHabitants() {
		return nbHabitants;
	}

	// Setter hab
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	// Sortie
	@Override
	public String toString() {
		return "Ville{" +
				"nomVille='" + nomVille + '\'' +
				", nbHabitants=" + nbHabitants +
				'}';
	}

	// Executable
	public static void main(String[] args) {

		// Tableau
		List<Ville> villeList = new ArrayList<Ville>();

		// Elément tableau
		villeList.add(new Ville("Nice", 343000));
		villeList.add(new Ville("Carcassonne", 47000));
		villeList.add(new Ville("Narbonne", 53000));
		villeList.add(new Ville("Lyon", 484000));
		villeList.add(new Ville("Foix", 9700));
		villeList.add(new Ville("Pau", 77200));
		villeList.add(new Ville("Marseille", 850700));
		villeList.add(new Ville("Tarbes", 40600));

		// ---------------------- Print ----------------------
		
		// ---------- Ville maxi ----------
		System.out.println(villeList); // Afficher toutes les villes
		int max = 0; // Varriable piur avoir le max d'habitant
		String villeMax = ""; // Varriable pour afficher le nom de la ville

		for (Ville ville : villeList) { // Pour toutes les villes dans VilleList (inversé)
			if (ville.getNbHabitants() > max) { // Si le nmb d'hab est suppérieur à max
				max = ville.getNbHabitants(); // Remplacer max par la nouvelle valeur
				villeMax = ville.getNomVille(); // Remplacer le nom par le nouveau nom
			}
		}

		// ---------- Ville mini ----------

		System.out.println(""); // Un espace
		System.out.println("La ville la plus peuplé est : " + villeMax + " qui à " + max + " habitants"); // petit print

		int min = Integer.MAX_VALUE; // Varriable piur avoir le min d'habitant (avec la valeur maximum par défaut)
		// Autre moyen pour initialiser un nom de variable
		Ville villeMin = null; // Varriable pour afficher le nom de la ville
		for (Ville ville : villeList) { // Pour toutes les villes dans VilleList (inversé)
			if (ville.getNbHabitants() < min) { // si le nombre d'hab est inférieur à la valeur min
				min = ville.getNbHabitants(); // Remplacer min par la nouvelle valeur
				villeMin = ville; // Remplacer le nom par la nouvelle valeur
			}
		}

		if (villeMin != null) { // Si le nom de la ville n'est pas nul
			villeList.remove(villeMin); // Supprimer la ville
			// Petit message
			System.out.println("La ville " + villeMin.getNomVille() + " de " + min + " habitants, à été supprimé");
		}
		// test ->
		// System.out.println(villeList);

		// ---------- Ville majuscule ----------

		String villeNom = ""; // Initialisation de la variable ville nom

		for (Ville ville : villeList) { // Pour tous les éléments de la ville dans le tableau
			if (ville.getNbHabitants() > 100000) { // Si le nombre d'hab est supérieur à 100k
				villeNom = ville.getNomVille().toUpperCase(); // Mettre le nom en majuscule
				System.out.println(villeNom); // Afficher le nom de la ville concernée
			}

		}


	}
}
