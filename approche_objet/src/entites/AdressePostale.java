package entites;

public class AdressePostale {
	int num_rue;
	String lib_rue;
	int cp;
	String ville;

	public AdressePostale(int num_rue, String lib_rue, int cp, String ville) {
		this.num_rue = num_rue;
		this.lib_rue = lib_rue;
		this.cp = cp;
		this.ville = ville;
	};

	// public int getNum_rue() {
	// return num_rue;
	// };

	// public String getLib_rue() {
	// return lib_rue;
	// };

	// public int getPostale() {
	// return cp;
	// };

	// public String getVille() {
	// return ville;
	// };

	public String toString() {
		return (num_rue + " " + lib_rue + " | Code Postale : " + cp + " | Ville : " + ville);
	};
}
