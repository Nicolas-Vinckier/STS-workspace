package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");
		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");

		// Nouvelle liste
		List<String> liste3 = new ArrayList<String>(); // Création de la liste (ne pas changer) 
		for (String element : liste1) { // Parcour les éléments de la liste1
			liste3.add(element); // ajoute les éléments dans la liste3 
		}

		// pareil 
		for (String element : liste2) { 
			liste3.add(element); 
		}

		// print 
		System.out.println(liste3);
	}
}
