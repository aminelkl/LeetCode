/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Return the running sum of nums.  
*/

  class Solution {
    public int[] runningSum(int[] nums) {
       
// Answer starts here
        int sum = 0;
        int[] runningSum = new int[nums.length];
        
        for (int i = 0 ; i < nums.length ; i++) {
            sum = sum + nums[i];
            runningSum[i] = sum;
        }
        
        return runningSum;
        
    }
}

