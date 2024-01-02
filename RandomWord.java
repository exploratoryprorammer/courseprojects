/* *****************************************************************************
 *  Name:              Rohan Sah
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        double num = 1;
        double i = 1;
        String champ = "";
        while (!StdIn.isEmpty()) {
            if (StdRandom.bernoulli(num / i)) {
                champ = StdIn.readString();
            }
            else {
                StdIn.readString();
            }
            i++;
        }
        StdOut.print(champ);
    }
}
