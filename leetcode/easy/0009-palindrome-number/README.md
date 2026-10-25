# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** Java  
**Runtime:** 14 ms (beats 13.35%)  
**Memory:** 45.5 MB (beats 92.85%)  
**Submitted:** 2026-10-25T14:39:14.978Z  

```java
class Solution {
    public boolean isPalindrome(int x) {
        boolean b=false;
        int dup=x;
        int rev=0;
        while(x>0){
           int  la=x%10;
            rev=rev*10+la;
            x=x/10;
        }
        if(rev==dup){
            b=true;
        }
        return b;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)