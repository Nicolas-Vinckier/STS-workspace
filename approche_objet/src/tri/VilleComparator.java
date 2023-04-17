package tri;

import java.util.Comparator;

import listes.Ville;

public class VilleComparator implements Comparator<Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
        int variable = o1.getNomVille().compareTo(o2.getNomVille());
        return variable;

    }

}
