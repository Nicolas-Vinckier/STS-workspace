package fichier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

	static class Ville {
		// Instanciation Attribut
		public String nom;
		public String codeDepartement;
		public String nomRegion;
		public String populationTotale;

		// Constructeur
		public Ville(String nom, String codeDepartement, String nomRegion, String populationTotale2) {
			this.nom = nom;
			this.codeDepartement = codeDepartement;
			this.nomRegion = nomRegion;
			this.populationTotale = populationTotale2;
		}

		// Getters
		public String getNom() {
			return nom;
		}

		public String getCodeDepartement() {
			return codeDepartement;
		}

		public String getNomRegion() {
			return nomRegion;
		}

		public String getPopulationTotale() {
			return populationTotale;
		}
	}

	public static void main(String[] args) throws IOException {
		// Path principale
		Path path = Paths.get(
				"C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\fichier\\recensement.csv");

		List<String> lines = Files.readAllLines(path, Charset.defaultCharset()); // Lire toutes les lignes

		// Création de la liste d'instances de la classe Ville
		ArrayList<Ville> villes = new ArrayList<Ville>();

		// Parcours des lignes du fichier
		for (String ligne : lines) {
			// Découpage de la ligne en tableau de chaînes de caractères
			String[] tokens = ligne.split(";");

			// Extraction des informations
			String nom = tokens[0];
			String codeDepartement = tokens[1];
			String nomRegion = tokens[2];
			String populationTotale = tokens[3];

			// Création d'une instance de la classe Ville
			Ville ville = new Ville(nom, codeDepartement, nomRegion, populationTotale);

			// Ajout de l'instance à la liste
			villes.add(ville);
		}

		// Affichage des villes
		// for (Ville ville : villes) {
		// System.out.println("Nom: " + ville.getNom());
		// System.out.println("Code département: " + ville.getCodeDepartement());
		// System.out.println("Nom région: " + ville.getNomRegion());
		// System.out.println("Population totale: " + ville.getPopulationTotale());
		// System.out.println("-----------");
		// }


		
	}

}
