package tri;

import java.util.Comparator;

import listes.Ville;

public class HabComparator implements Comparator<Ville> {

    @Override
    public int compare(Ville o1, Ville o2) {
        int variable = o1.getNbHabitants().compareTo(o2.getNbHabitants());
        return variable;

    }

}
