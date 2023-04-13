package sets;

import java.util.ArrayList;
import java.util.List;

public class Pays {
	public String nom;
	public float nbH;
	public float PIB;

	public Pays(String nom, float nbH, float PIB) {
		this.nom = nom;
		this.nbH = nbH;
		this.PIB = PIB;
	}

	@Override
	public String toString() {
		return "Pays{" +
				"nom='" + nom + '\'' +
				", nombreHabitants=" + nbH +
				", pibParHabitant=" + PIB +
				'}';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Pays> Paylist = new ArrayList<Pays>();
		Paylist.add(new Pays("USA", 328200000, 62794));
		Paylist.add(new Pays("France", 66990000, 42082));
		Paylist.add(new Pays("Allemagne", 83020000, 50206));
		Paylist.add(new Pays("UK", 66650000, 46827));
		Paylist.add(new Pays("Italie", 60360000, 35708));
		Paylist.add(new Pays("Japon", 126860000, 40854));
		Paylist.add(new Pays("Chine", 1415045928, 10153));
		Paylist.add(new Pays("Russie", 144500000, 11261));
		Paylist.add(new Pays("Inde", 1339180127, 2041));
		System.out.println(Paylist);

		// ---------- Ville maxi ----------
		float max = 0;
		String PayMax = "";

		for (Pays pays : Paylist) {
			if (pays.PIB > max) {
				max = pays.PIB;
				PayMax = pays.nom;
			}
		}
		
		System.out.println("");
		System.out.println("Pays avec le plus grand PIB par habitant : " + PayMax + ", PIB par habitant : " + max);

	}
}
