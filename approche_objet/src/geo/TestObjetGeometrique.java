package geo;

public class TestObjetGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique[] FORME = new ObjetGeometrique[2];

        FORME[0] = new Cercle(20d);
        FORME[1] = new Rectangle(10d, 15d);

        for (int i = 0; i < FORME.length; i++) {

            if (FORME[i] instanceof Cercle) {
                System.out.println("Le cercle : ");
                System.out.println("Périmètre : " + FORME[i].perimetre());
                System.out.println("Surface : " + FORME[i].surface());
                System.out.println("");
            } else if (FORME[i] instanceof Rectangle) {
                System.out.println("Le rectangle : ");
                System.out.println("Périmètre : " + FORME[i].perimetre());
                System.out.println("Surface : " + FORME[i].surface());
                System.out.println("");
            }
        }

    }
}
