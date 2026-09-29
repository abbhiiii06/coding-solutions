# First and Last in Sorted

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a sorted array  **arr[]**  with possibly some duplicates, find the first and last occurrences of an element  **x**  in the given array.
 **Note:**  If the number  **x**  is not found in the array then return both the indices as -1.

 **Examples:** 

```
Input: arr[] = [1, 3, 5, 5, 5, 5, 67, 123, 125], x = 5
Output: [2, 5]
Explanation: First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5

```

```
Input: arr[] = [1, 3, 5, 5, 5, 5, 7, 123, 125], x = 7
Output: [6, 6]
Explanation: First and last occurrence of 7 is at index 6

```

```
Input: arr[] = [1, 2, 3], x = 4
Output: [-1, -1]
Explanation: No occurrence of 4 in the array, so, output is [-1, -1]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-29T04:41:29.125Z  

```java
class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
      ArrayList<Integer> a=new ArrayList<>();
      ArrayList<Integer> b=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          if(arr[i]==x){
              a.add(i);
          }
      }
      int newarr[]={-1,-1};
      if(!a.isEmpty()){
          newarr[0]=a.getFirst();
          newarr[1]=a.getLast();
      }
      for(int num:newarr){
          b.add(num);
      }
      return b;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1)