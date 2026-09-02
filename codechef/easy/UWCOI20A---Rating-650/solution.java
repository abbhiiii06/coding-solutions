import java.util.*;
import java.lang.*;
import java.io.*;

import java.io.*;
import java.util.*;

class Codechef {

    static class FastScanner {

        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }

            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();

        int T = fs.nextInt();

        for (int i = 0; i < T; i++) {

            int N = fs.nextInt();

            long max = 0;

            for (int j = 0; j < N; j++) {

                long val = fs.nextLong();

                if (val > max) {
                    max = val;
                }
            }

            System.out.println(max);
        }
    }
}
