package sumoftwotree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SumOfTwoTree {

    /*--------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {

        int val = 5;

        Set<Integer> set = new TreeSet<>();

        for (int i = 0; i < 30; i++) {
            set.add((int) (Math.random() * 30));
        }

        System.out.println("Given Data = " + set);

        Iterator<Integer> iter1 = set.iterator();
        while (iter1.hasNext()) {
            
            int a = iter1.next();
            if (a > val) break;


            Iterator<Integer> iter2 = set.iterator();
            while (iter2.hasNext()) {

                int b = iter2.next();
                if (b > val) break;

                if ((a + b) == val) {
                    System.out.printf("%2d + %2d = %2d\n", a, b, a + b);
                }
            }
        }
    }
}
/*--------------------------------------------------------------------------------------------*/
