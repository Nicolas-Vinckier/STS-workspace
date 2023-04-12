package banque;

public class CompteTaux extends Compte {
	protected float tr;

	public CompteTaux(int numero_de_compte, float solde, float tr) {
		super(numero_de_compte, solde); // Appel au constructeur de la classe mère
		this.tr = tr;
	};

	// Méthode de classe dérivé de la méthode de la classe mère
	@Override
	public String toString() {
		return super.toString() + " | Taux : " + tr;
	};
};
