package entites;

import java.util.TooManyListenersException;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adresse1 = new AdressePostale();
		adresse1.num_rue = 468;
		adresse1.lib_rue = "Rue du soleil";
		adresse1.cp = 34800;
		adresse1.ville = "Berlin";
		System.out.println(adresse1.toString());
	};

};
