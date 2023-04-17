package fichier;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectureFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(
				"C:\\Users\\mrcan\\OneDrive\\Bureau\\STS-workspace\\approche_objet\\src\\fichier\\recensement.csv");
		System.out.println(path.getRoot());
		System.out.println(path.getParent());
		System.out.println(path);

		List<String> lines = Files.readAllLines(path, Charset.defaultCharset());

		for (String line : lines) {
			System.out.println(line);
		}

	}

}
