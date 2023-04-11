package entites;

public class Personne {
	String nom;
	String prenom;
	String adresse;

	public Personne(String nom, String prenom, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	};

	public String getNom() {
		return nom;
	};

	public void setNom(String nom) {
		this.nom = nom;
	};

	public String getPrenom() {
		return prenom;
	};

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	};

	public String getAddresse() {
		return this.adresse;

	};

	public void setAddresse(String adresse) {
		this.adresse = adresse;
	};

	public String toString() {
		return ("Identité -> Nom : " + nom + " | Prénom : " + prenom + " | Addresse : " + adresse.toString());
	}
}
