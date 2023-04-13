package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> Villeagois = new ArrayList<String>();
		Villeagois.add("Nice");
		Villeagois.add("Carcassonne");
		Villeagois.add("Narbonne");
		Villeagois.add("Lyon");
		Villeagois.add("Foix");
		Villeagois.add("Pau");
		Villeagois.add("Marseille");
		Villeagois.add("Tarbes");
		System.out.println(Villeagois);

		int bigmot = 0; 

		for (int i = 1; i < Villeagois.size();) {
			String mot = Villeagois.get(i);
			int tailledumot = mot.length();
			System.out.println("La taille du mot " + Villeagois.get(i) + " est de " + tailledumot + " caractères");

			while (true) {
				if (tailledumot > bigmot) {
					bigmot = tailledumot;
				}
				if (tailledumot < bigmot) {
					continue;
				}
			}
		}


		// Faire en sorte de supprimer les villes qui commence par N 

	}
}