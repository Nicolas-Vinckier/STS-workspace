package sets;

public class TestSetDouble {

	public static void main(String[] args) {

		double[] HashSet = { 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01 };

		double JeanMax = 0;

		for (int i = 0; i < HashSet.length; i++) {
			System.out.println(HashSet[i]);
			if (HashSet[i] > JeanMax) {
				JeanMax = HashSet[i];
			}
		}
		System.out.println("Le plus gros est " + JeanMax);

		double JeanMin = Integer.MAX_VALUE;

		for (int i = 0; i < HashSet.length; i++) {
			if (HashSet[i] < JeanMin) {
				JeanMin = HashSet[i];
			}
		}
		System.out.println("Le plus faible est " + JeanMin);

		// Supprimé le plus petit 

	}
}