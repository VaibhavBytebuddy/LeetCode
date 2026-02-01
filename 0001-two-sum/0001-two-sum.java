class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0 ; i<nums.length-1;i++){
            for (int j=i+1;j< nums.length; j++){
                if(target == nums[i]+nums[j])
                return new int []{i,j};
            }
        }
        return new int[]{0,0} ;
        //  for (int i = 0; i < nums.length - 1; i++) {
        //     int output = target - nums[i];
        //         if (nums[i+1] == output) {
        //             return new int[]{i, i+1};
        //         }
        //     }
        
        // return new int[]{-1, -1};
    }
}