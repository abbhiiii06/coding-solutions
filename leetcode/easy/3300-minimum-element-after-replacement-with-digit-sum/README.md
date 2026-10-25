# Minimum Element After Replacement With Digit Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer array `nums`.

You replace each element in `nums` with the  **sum**  of its digits.

Return the  **minimum**  element in `nums` after all replacements.

 

 **Example 1:** 

 **Input:**  nums = [10,12,13,14]

 **Output:**  1

 **Explanation:** 

`nums` becomes `[1, 3, 4, 5]` after all replacements, with minimum element 1.

 **Example 2:** 

 **Input:**  nums = [1,2,3,4]

 **Output:**  1

 **Explanation:** 

`nums` becomes `[1, 2, 3, 4]` after all replacements, with minimum element 1.

 **Example 3:** 

 **Input:**  nums = [999,19,199]

 **Output:**  10

 **Explanation:** 

`nums` becomes `[27, 10, 19]` after all replacements, with minimum element 10.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 104

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 12.10%)  
**Memory:** 44.8 MB (beats 60.31%)  
**Submitted:** 2026-10-25T09:36:29.231Z  

```java
class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer>a=new ArrayList<>();
        int sum=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                sum+=nums[i]%10;
                nums[i]=nums[i]/10;
                if(nums[i]==0){
                    a.add(sum);
                    sum=0;
                }
            }
        }
        min=Collections.min(a);
        return min;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/)