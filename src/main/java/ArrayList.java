import java.util.Arrays;
import java.util.Random;

/**
 * Created by gfox on 17/10/2014.
 */
public class ArrayList {

    public static void main(String[] args) {
        Random r = new Random();
        double randomValue = 60 * r.nextDouble() + 10;

        java.util.ArrayList<Integer> al = new java.util.ArrayList<Integer>();
        al.add(2);
        al.add(5);

        Integer[] a = new Integer[5];
        al.addAll(new java.util.ArrayList<>(Arrays.asList(a)));
        a = al.toArray(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
