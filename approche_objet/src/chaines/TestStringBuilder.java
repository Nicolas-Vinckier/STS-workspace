package chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder nombre = new StringBuilder("Hello");

		long debut = System.currentTimeMillis();
		// Code à chronométrer
		for (int i = 0; i < 100000; i++) {
			nombre.append(i);
		}

		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé pour StringBuilder : " + (fin - debut) + " millisecondes");

		String nombre2 = "";
		long debut2 = System.currentTimeMillis();
		// Code à chronométrer
		for (int i = 0; i < 100000; i++) {
			nombre2 = nombre2 + i; 
		}

		long fin2 = System.currentTimeMillis();
		System.out.println("Temps écoulé pour simple concaténation (+) : " + (fin2 - debut2)+ " millisecondes");

	}

}
