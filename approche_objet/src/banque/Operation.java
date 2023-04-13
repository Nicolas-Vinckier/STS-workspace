package banque;

public abstract class Operation {
    protected String date; 
    protected float montant; 

    // Constructeur
    public Operation(String date, float montant) {
		this.date = date;
		this.montant = montant;
	};

    public String getDate() {
		return date;
	};

    public float getMontant() {
        return montant;
    };

    public String toString() {
        return (date + " " + montant); 
    };
};
