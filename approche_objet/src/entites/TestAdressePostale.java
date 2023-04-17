package entites;

// import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {


		AdressePostale adresse1 = new AdressePostale(468, "Rue du soleil", 34800, "Berlin");
		Personne personne1 = new Personne("Gerard", "Kevin", adresse1.toString());

		System.out.println(personne1.toString());
		// System.out.println(personne1.getNom());
		personne1.setNom("Space");
		System.out.println(personne1.getNom());
		System.out.println(personne1.getAddresse());
		personne1.setAddresse("Comment ça le reuf, 34000, Paris");
		System.out.println(personne1.getAddresse());

		System.out.println("Nom : " + personne1.getNom().toUpperCase() + " || Prénom : " + personne1.getPrenom());
	};

};
