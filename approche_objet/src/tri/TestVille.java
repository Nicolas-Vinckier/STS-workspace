package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listes.Ville;

public class TestVille {

	public static void main(String[] args) {

		// Tableau
		List<Ville> villeList = new ArrayList<Ville>();

		// Elément tableau
		villeList.add(new Ville("Nice", 343000));
		villeList.add(new Ville("Carcassonne", 47000));
		villeList.add(new Ville("Narbonne", 53000));
		villeList.add(new Ville("Lyon", 484000));
		villeList.add(new Ville("Foix", 9700));
		villeList.add(new Ville("Pau", 77200));
		villeList.add(new Ville("Marseille", 850700));
		villeList.add(new Ville("Tarbes", 40600));

		// ---------------------- Print ----------------------

		Collections.sort(villeList, new VilleComparator());
		System.out.println(villeList);
		System.out.println("");
		Collections.sort(villeList, new HabComparator());
		System.out.println(villeList);
	}

}
