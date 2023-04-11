package entites;

public class Personne {
	String nom;
	String prenom;
	AdressePostale adresse;

	public Personne(String nom, String prenom, AdressePostale addresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = addresse;

	}

	public String toString() {
		return ("Identité -> Nom : " + nom + " | Prénom : " + prenom + " | Addresse : " + adresse.toString());
	}
}
