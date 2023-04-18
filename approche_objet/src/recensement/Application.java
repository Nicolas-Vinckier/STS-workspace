package recensement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {
	// Variables
	public String codeRegion;
	public String nomRegion;
	public String codeDepartement;
	public String codeCommune;
	public String nomCommune;
	public int populationTotale;

	// Constructeur
	public void Region(String codeRegion, String nomRegion, int populationTotale) {
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.populationTotale = populationTotale;
	}

	// Getters et Setters
	public String getCodeRegion() {
		return codeRegion;
	}

	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public int getPopulationTotale() {
		return populationTotale;
	}

	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	/* Application ------------------------------------------------------- */
	public String rechercherRegionsLesPlusPeuplees() {

		return null;
	}

	public String rechercherDepartementLesPlusPeuplees() {

		return null;
	}

	// Execution
	public static void main(String[] args) throws IOException {
		// Path principale
		Path path = Paths.get(
				"C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\recensement\\recensement.csv");

		List<String> lines = Files.readAllLines(path, Charset.defaultCharset()); // Lire toutes les lignes
		lines.remove(0); // Supprime la première ligne

		// Création de la liste d'instances de la classe Ville
		ArrayList<String> villes = new ArrayList<>();

		for (String ligne : lines) {
			// Découpage de la ligne en tableau de chaînes de caractères
			String[] tokens = ligne.split(";");
			String codeDepartement = tokens[1];
			String nomRegion = tokens[2];
			int populationTotale = Integer.parseInt(tokens[7].replace(" ", ""));
			String nom = "";

			// Création d'une instance de la classe region 
			Region region = new ArrayList(Region.getCodeDepartement);

			// Ajout de l'instance à la liste
			villes.add(ville);
		}
	}

}
