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

		// int bigmot = 0;
		String bigmot = "";

		// for (int i = 1; i < Villeagois.size();) {
		// String mot = Villeagois.get(i);
		// int tailledumot = mot.length();
		// System.out.println("La taille du mot " + Villeagois.get(i) + " est de " +
		// tailledumot + " caractères");

		// while (true) {
		// if (tailledumot > bigmot) {
		// bigmot = tailledumot;
		// }
		// if (tailledumot < bigmot) {
		// break;
		// }
		// }
		// }

		// Suppretion de la boucle infinie #While(true)
		for (int i = 0; i < Villeagois.size(); i++) {
			String mot = Villeagois.get(i);
			int tailledumot = mot.length();
			System.out.println("La taille du mot " + Villeagois.get(i) + " est de " + tailledumot + " caractères");

			if (tailledumot > bigmot.length()) { // Comparer la taille du mot avec la taille du plus gros mot actuel
				bigmot = mot; // Mettre à jour le plus gros mot si nécessaire
			}
		}
		System.out.println("");
		System.out.println("Le plus gros mot est : " + bigmot + " qui fait " + bigmot.length() + " caractères");

		// Faire en sorte de supprimer les villes qui commence par N

	}
}