package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		String chaine = "12"; 

		int Convertisseur = Integer.parseInt(chaine);

		int a = 5;
		int b = 10;

		int maximum = Integer.max(a, b);

		System.out.println("La chaîne de caractères : " + chaine);
		System.out.println("Le nombre entier : " + Convertisseur);
		System.out.println("La valeur maximum entre " + a + " et " + b + " est : " + maximum);
	}
}
