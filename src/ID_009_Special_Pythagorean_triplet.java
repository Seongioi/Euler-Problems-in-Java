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
        //guesses the "b" value starting from 1 and incrementing
        while (total != 1000) {//set sum of Pythagorean triple that youre trying to find.
            b++;
            int temp = 0;
            while (temp < b) {//checks any possible "a" value as long as a < b
                temp++;
                if (isInt(sqrt(squared(temp) + squared(b)))) {//check if number guessed fits a^2 + b^2 = c^2
                    c = (int) sqrt(squared(temp) + squared(b));
                    a = temp;
                }
            }
            if (c > b)//makes sure a < b < c
                total = a + b + c;
        }

        System.out.println("a:" + a + "\n" +
                            "b:" + b + "\n" +
                            "c:" + c + '\n' +
                            "and their product is: " + a*b*c);
    }

    //returns x^2 as an int
    public static int squared(int x){
        return (x * x);
    }

    //checks if the double "x" is a whole number
    public static boolean isInt(double x){
        return (x % 1) == 0;
    }

}
