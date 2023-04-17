package entites;

public class Theatre {
	public String nom;
	public static int capMax;
	public static int clientIns;
	public float recete;

	public static Object inscrire(int capMax, int clientIns) {
		if (capMax <= clientIns) {
			System.out.println("Inscription ok");
		} else {
			System.out.println("Inscription impossible");
		}
		return clientIns;
	}

	public static void main(String[] args) {
		clientIns = 13;
		capMax = 30; 
		
		inscrire(clientIns, capMax);

	}

}
