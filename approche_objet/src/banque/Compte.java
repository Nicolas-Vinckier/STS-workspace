package banque;

public class Compte {
	protected int numero_de_compte;
	protected float solde;

	// Constructeur
	public Compte(int numero_de_compte, float solde) {
		this.numero_de_compte = numero_de_compte;
		this.solde = solde;
	};

	// Avoir le numéro du compte
	public int getNumeroDeCompte() {
		return numero_de_compte;
	};

	// Avoir le solde du compte
	public float getSolde() {
		return solde;
	};

	// Return
	public String toString() {
		return ("Numéro du compte : " + numero_de_compte + " | Solde : " + solde + " €" );
	};
};
