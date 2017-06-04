import static java.lang.Math.sqrt;
import java.util.*;

/**
 * Created by seong on 5/31/2017.
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which
 *  a^2 + b^2 = c^2
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class ID_009_Special_Pythagorean_triplet {
    public static void main(String args []){
        int total = 0;
        int a = 0, b = 1, c = 2;
        while (total != 1000) {//set max
            b++;
            int temp = 0;
            while (temp < b) {
                temp++;
                if (isInt(sqrt(squared(temp) + squared(b)))) {
                    c = (int) sqrt(squared(temp) + squared(b));
                    a = temp;
                }
            }
            if (c > b)
                total = a + b + c;
        }

        System.out.println("a:" + a + "\n" +
                            "b:" + b + "\n" +
                            "c:" + c + '\n' +
                            "and their product is: " + a*b*c);
    }

    public static int squared(int x){
        return (x * x);
    }

    public static boolean isInt(double x){
        return (x % 1) == 0;
    }

}
