// Probably not the most efficient way to solve it, but it works!
// I'll try another solution later..

// Loop that goes to each index, than 2 underloop to calculate whats on the left and whats on the right. Than comparing each sum.

class Solution {
    public int pivotIndex(int[] nums) {
        
        for (int i = 0; i < nums.length ; i++) 
        {
            int leftsum = 0;
            int rightsum = 0;
            
            for (int z = 0 ; z < i ; z++ ) {
                leftsum = leftsum + nums[z];
            }
            
            for (int y = nums.length - 1 ; y > i ; y--) {
                rightsum = rightsum + nums[y];
            }
            
            if (leftsum == rightsum) {
                return i;
            }    

        }
 
        return -1;
 
    }
}
