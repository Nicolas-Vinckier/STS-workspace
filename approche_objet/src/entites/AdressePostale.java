package entites;

public class AdressePostale {
	int num_rue = 0;
	String lib_rue = "undefind";
	int cp = 0;
	String ville = "undefind";

	public String toString() {
		return (num_rue + " " + lib_rue + " | Code Postale : " + cp + " | Ville : " + ville);
	}

}
