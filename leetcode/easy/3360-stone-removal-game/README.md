# Stone Removal Game

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Alice and Bob are playing a game where they take turns removing stones from a pile, with  *Alice going first*.

- Alice starts by removing exactly 10 stones on her first turn.
- For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.

The player who cannot make a move loses the game.

Given a positive integer `n`, return `true` if Alice wins the game and `false` otherwise.

 

Original
Java
 **Example 1:** 

 **Input:**  n = 12

 **Output:**  true

 **Explanation:** 

- Alice removes 10 stones on her first turn, leaving 2 stones for Bob.
- Bob cannot remove 9 stones, so Alice wins.

 **Example 2:** 

 **Input:**  n = 1

 **Output:**  false

 **Explanation:** 

- Alice cannot remove 10 stones, so Alice loses.

 

 **Constraints:** 

- 1 <= n <= 50

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 41.5 MB (beats 72.64%)  
**Submitted:** 2026-11-26T16:06:11.976Z  

```java
class Solution {
    public boolean canAliceWin(int n) {
        int take=10;
        int k=0;
        while(n>=take){
            n=n-take;
            take--;
            k++;
        }
        return k%2==1;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-removal-game/)