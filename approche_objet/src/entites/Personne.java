package entites;

public class Personne {
	String nom = "undefined";
	String prenom = "undefined";
	AdressePostale adresse; 

	public String toString() {
		return ("Identitée -> Nom : " + nom + " | Prénom : " + prenom + " | Addresse : " + adresse.toString());
	}
}
