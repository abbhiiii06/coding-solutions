# GCD of Odd and Even Sums

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `n`. Your task is to compute the  **GCD**  (greatest common divisor) of two values:

- sumOdd: the sum of the smallest n positive odd numbers.
- sumEven: the sum of the smallest n positive even numbers.

Return the GCD of `sumOdd` and `sumEven`.

 

Original
Java
 **Example 1:** 

 **Input:**  n = 4

 **Output:**  4

 **Explanation:** 

- Sum of the first 4 odd numbers sumOdd = 1 + 3 + 5 + 7 = 16
- Sum of the first 4 even numbers sumEven = 2 + 4 + 6 + 8 = 20

Hence, `GCD(sumOdd, sumEven) = GCD(16, 20) = 4`.

 **Example 2:** 

 **Input:**  n = 5

 **Output:**  5

 **Explanation:** 

- Sum of the first 5 odd numbers sumOdd = 1 + 3 + 5 + 7 + 9 = 25
- Sum of the first 5 even numbers sumEven = 2 + 4 + 6 + 8 + 10 = 30

Hence, `GCD(sumOdd, sumEven) = GCD(25, 30) = 5`.

 

 **Constraints:** 

- 1 <= n <= 10​​​​​​​00

## Solution

**Language:** Java  
**Runtime:** 583 ms (beats 5.33%)  
**Memory:** 41.5 MB (beats 99.21%)  
**Submitted:** 2026-11-24T16:28:55.676Z  

```java
class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==1){
            return 1;
        }
        int evennum=0;
        int oddnum=0;
        int max=0;
        for(int i=1;i<=n*2;i++){
            if(i%2==0){
                evennum+=i;
            }else{
                oddnum+=i;
            }
        }
        for(int i=1;i<=oddnum/2;i++){
            if(evennum%i==0 && oddnum%i==0){
               max=Math.max(max,i);
            }
        }
        return max;
       
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/gcd-of-odd-and-even-sums/)