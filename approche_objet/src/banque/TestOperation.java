package banque;

// import banque.Operation;
// import banque.Debit;
// import banque.Credit;

public class TestOperation extends Operation {
	// this.date=super.date;
	// this.montant=super.montant;

	public TestOperation(String date, float montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Operation[] opps = new Operation[4];

		opps[0] = new Debit("12/08/2018", 48.92f);
		opps[1] = new Credit("25/01/1999", 1892.95f);
		opps[2] = new Debit("30/12/2011", 1256.5f);
		opps[3] = new Credit("01/01/2001", 111.11f);

		for (int i = 0; i < opps.length; i++) {
			System.out.println(opps[i].toString());
		}
	}

}
