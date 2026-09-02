# UWCOI20A - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Find maximum in an Array

Given a list of $N$ integers, representing height of mountains. Find the height of the tallest mountain.

### Input:
- First line will contain $T$, number of testcases. Then the testcases follow.
- The first line in each testcase contains one integer, $N$.
- The following line contains $N$ space separated integers: the height of each mountains.
### Output:

For each testcase, output one line with one integer: the height of the tallest mountain for that test case.

### Constraints
- $1 \leq T \leq 10$
- $1 \leq N \leq 100000$
- $0 \leq$ height of each mountain $\leq 10^9$
### Sample 1:
Input
Output

```
1
5
4 7 6 3 1
```

```
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T10:13:38.498Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/UWCOI20A)