package banque;

public class TestBanque {

	public static void main(String[] args) {
		/*
		 * Compte compte1 = new Compte(45875, 14.23f);
		 * // System.out.println(compte1.toString());
		 * 
		 * CompteTaux compteTaux1 = new CompteTaux(compte1.getNumeroDeCompte(),
		 * compte1.getSolde(), 0.05f);
		 * System.out.println(compteTaux1.toString());
		 * 
		 * Compte compte2 = new Compte(15673, 943371f);
		 * // System.out.println(compte1.toString());
		 * 
		 * CompteTaux compteTaux2 = new CompteTaux(compte2.getNumeroDeCompte(),
		 * compte2.getSolde(), 70f);
		 * System.out.println(compteTaux2.toString());
		 */

		Compte[] comptes = new Compte[2]; // Tableau de 2 éléments nommé "compte"

		Compte compteNormal = new Compte(45875, 14.23f); // Création du "comptenormal"
		comptes[0] = compteNormal; // Instanciation du compte dans le tableau à la première place

		CompteTaux compteTaux = new CompteTaux(15673, 943371f, 70f); // Création du "comptetaux"
		comptes[1] = compteTaux; // Instanciation du compte dans le tableau à la deuxième place

		for (Compte compte : comptes) { // Pour les comptes (qui est un tableau) de la classe compte 
			System.out.println(compte.toString()); // imprime le compte
		}

	}
}
