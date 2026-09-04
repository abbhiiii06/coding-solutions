import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) {
        // Fix 1: Added System.in so the Scanner can actually read input
        Scanner SC = new Scanner(System.in);
       
        int T = SC.nextInt();

        // Fix 2: Changed to T-- > 0 to safely run exactly T times
        while (T-- > 0) {
            int N = SC.nextInt();

            int max = Integer.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                int height = SC.nextInt();

                if (height > max) {
                    max = height; // Fix 3: Removed 'T++' from here
                }
            }

            System.out.println(max);
        }

        SC.close();
    }
}
