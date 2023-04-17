package entites;

public class Theatre {
	public String nom;
	public int capMax;
	public int clientIns;
	public float recete;

	public Object inscrire(int capMax, int clientIns){
		if (clientIns < capMax){
			System.out.println("Inscription ok");
		} else {
			System.out.println("Inscription impossible");
		}
		return clientIns;
	}

	public static void main(String[] args) {


	}

}
