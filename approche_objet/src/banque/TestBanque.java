package banque;

public class TestBanque {

	public static void main(String[] args) {
		Compte compte1 = new Compte(45875, 14.23f);
		// System.out.println(compte1.toString());

		CompteTaux compteTaux1 = new CompteTaux(compte1.getNumeroDeCompte(), compte1.getSolde(), 0.05f);
		System.out.println(compteTaux1.toString());

		Compte compte2 = new Compte(15673, 943371f);
		// System.out.println(compte1.toString());

		CompteTaux compteTaux2 = new CompteTaux(compte2.getNumeroDeCompte(), compte2.getSolde(), 70f);
		System.out.println(compteTaux2.toString());
	}
}
