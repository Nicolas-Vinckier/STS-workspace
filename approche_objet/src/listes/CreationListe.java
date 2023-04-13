package listes;

public class CreationListe {
    public static void main(String[] args) {

        int[] BigListe = new int[100];

        for (int i = 0; i < BigListe.length; i++) {
            BigListe[i] = i;
            System.out.println(BigListe[i]);
        }

    }
}
