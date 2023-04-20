package testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {

		for (Saison s : Saison.values()) {
			String nom = s.getNom();

			System.out.println(nom);

		}
		System.out.println("");

		// Saison ouech = Saison.ETE;
		// System.out.println(ouech.getNom());

		String nom = "ETE";
		Saison saison = Saison.valueOf(nom);
		System.out.println(saison.getNom());

		String libelle = "Hiver";
		System.out.println(Saison.aleSaison(libelle));

	}

}
