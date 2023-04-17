package fichier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\fichier\\recensement.csv");

		List<String> lines = Files.readAllLines(path, Charset.defaultCharset());

		Path pathCible = Paths
				.get("C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\fichier\\Cible.csv");

		// final List<String> lines100 = lines.subList(0, 100);

		// Créer un nouveau fichier Cible.csv
		Files.deleteIfExists(pathCible); // Supprimer le fichier Cible.csv s'il existe déjà
		Files.createFile(pathCible); // Créer un fichier (vide)

		List<String> lines100 = new ArrayList<>(); // Créer un tableau "lines100"
		for (int i = 0; i < 100; i++) {
			System.out.println(lines.get(i)); // Juste l'affichage
			lines100.add(lines.get(i)); // Ajoute dans "lines100" la ligne concerncée "i"
		}

		Files.write(pathCible, lines100); // Ecrit le fichier
	}

}
