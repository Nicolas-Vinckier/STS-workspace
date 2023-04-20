package testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

    private final String nom;
    private final Integer num;

    private Saison(String nom, Integer num) {
        this.nom = nom;
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public Integer getNum() {
        return num;
    }

    public static Saison aleSaison(String l) {
        for (Saison s : Saison.values()) {
            if (s.getNom().equals(l)) {
                return s;
            }
        }

        return null;
    }

}
