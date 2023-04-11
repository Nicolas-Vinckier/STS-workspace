package entites;

// import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse1 = new AdressePostale(468, "Rue du soleil", 34800, "Berlin");
		Personne personne1 = new Personne("Gerard", "Kevin", adresse1);

		System.out.println(personne1.toString());
	};

};
