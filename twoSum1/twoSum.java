/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int sum = 0;
        int[] answer = new int[2];
        
        for (int i = 0 ; i < nums.length ; i++) {
            for (int z = 0 ; z < nums.length ; z++){
                if (i != z) {
                    sum = nums[i] + nums[z];
                    if (sum == target) {
                        answer[0] = i; 
                        answer[1] = z;		
                    }
                }
            }
            
        }
        return answer;
        
    }
}
