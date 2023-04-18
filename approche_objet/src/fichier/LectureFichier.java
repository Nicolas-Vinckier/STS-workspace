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
		public int populationTotale;

		// Constructeur
		public Ville(String nom, String codeDepartement, String nomRegion, int populationTotale) {
			this.nom = nom;
			this.codeDepartement = codeDepartement;
			this.nomRegion = nomRegion;
			this.populationTotale = populationTotale;
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

		public int getPopulationTotale() {
			return populationTotale;
		}
	}

	public static void main(String[] args) throws IOException {
		// Path principale
		Path path = Paths.get(
				"C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\fichier\\recensement.csv");

		List<String> lines = Files.readAllLines(path, Charset.defaultCharset()); // Lire toutes les lignes
		lines.remove(0); // Supprime la première ligne

		// Création de la liste d'instances de la classe Ville
		ArrayList<Ville> villes = new ArrayList<Ville>();

		// Parcours des lignes du fichier
		for (String ligne : lines) {
			// Découpage de la ligne en tableau de chaînes de caractères
			String[] tokens = ligne.split(";");

			// Extraction des informations
			// String nom = tokens[0];
			// String codeDepartement = tokens[1];
			// String nomRegion = tokens[2];
			// int populationTotale = Integer.parseInt(tokens[3]);
			// String codeRegions = tokens[0];
			String nomRegion = tokens[2];
			String codeDepartement = tokens[1];
			// String codeArrondissement = tokens[3];
			// String codeCanton = tokens[4];
			// String nomCommune = tokens[5];
			// String populationMunicipale = tokens[6];
			// String populationCompt = tokens[7];
			int populationTotale = Integer.parseInt(tokens[7].replace(" ", ""));

			String nom = "";
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

		Path pathCible = Paths
				.get("C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\fichier\\Cible.csv");
		Files.deleteIfExists(pathCible); // Supprimer le fichier Cible.csv s'il existe déjà
		Files.createFile(pathCible); // Créer un fichier (vide)
		List<String> lefichier = new ArrayList<>(); // Créer un tableau

		for (Ville ville : villes) {

			System.out.println(ville.getPopulationTotale());

			if (ville.getPopulationTotale() > 25000) {
				lefichier.add(ville.getCodeDepartement() + ";" + ville.getNomRegion() + ";" + ville.getPopulationTotale());
			}
		}

		Files.write(pathCible, lefichier, Charset.defaultCharset());

		System.out.println("Nombre de villes dans le fichier cible : " + lefichier.size());

	}

}
