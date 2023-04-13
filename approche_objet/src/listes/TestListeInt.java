package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> TestListeInt = new ArrayList<Integer>();
        TestListeInt.add(-1);
        TestListeInt.add(5);
        TestListeInt.add(7);
        TestListeInt.add(3);
        TestListeInt.add(-2);
        TestListeInt.add(4);
        TestListeInt.add(8);
        TestListeInt.add(5);
        System.out.println(TestListeInt);
        System.out.println(TestListeInt.size());

        int max = TestListeInt.get(0);
        int min = TestListeInt.get(0);

        for (int i = 1; i < TestListeInt.size(); i++) {
            if (TestListeInt.get(i) > max) {
                max = TestListeInt.get(i);
            }
            if (TestListeInt.get(i) < min) {
                min = TestListeInt.get(i);
            }
        }

        // supprimer le minium

        System.out.println(max);
        System.out.println(min);
        
        System.out.println("------------------------------------------");
        // Supporieur ou ADCinférieur 
        for (int i = 1; i < TestListeInt.size(); i++) {
            if (TestListeInt.get(i) > 0) {
                System.out.println(TestListeInt.get(i) + " Support");
            }
            if (TestListeInt.get(i) < 0) {
                System.out.println(TestListeInt.get(i) + " ADC");
            }
        }

    }
}
