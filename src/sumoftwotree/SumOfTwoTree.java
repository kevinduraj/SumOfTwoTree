package sumoftwotree;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SumOfTwoTree {

    /*--------------------------------------------------------------------------------------------*/
    public static void main(String[] args) {

        int twoSum = 44;
        int[] array = { -2, -14, -3, 5, 6, 7, 10, 34, 3, 56, 100 };
        
        Set<Integer> set = new TreeSet<>();
        
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }            
        System.out.println("Given Data:\n" + set);
        System.out.println("Searching for sum of two: " + twoSum + "\n");

        Iterator<Integer> iter1 = set.iterator();
        while (iter1.hasNext()) {
            
            int a = iter1.next();

            Iterator<Integer> iter2 = set.iterator();
            while (iter2.hasNext()) {

                int b = iter2.next();

                if ((a + b) == twoSum) {
                    System.out.printf("%2d + %2d = %2d\n", a, b, a + b);
                } else if ((a + b) > twoSum) {
                    //int sum = a + b;
                    //System.out.println("breaking: " + a + " + " + b + " = " + sum);
                    break;
                }
            }
        }
    }
}
/*--------------------------------------------------------------------------------------------*/
