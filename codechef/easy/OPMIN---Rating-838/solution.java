import java.util.*;
import java.util.Scanner;

 class Solution{
    public int countNonMinimum(int[]nums){
        if(nums.length<=1){
            return 0;
        }
        int min=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>min){
                count++;
            }
        }
        return count;
    }
}