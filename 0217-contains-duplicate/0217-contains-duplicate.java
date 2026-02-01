class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            if(hm.containsValue(nums[i])){
                return true ;
            }
            else{
                hm.put(i,nums[i]);
            }
        }
        return false; 
        */
        
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                return true;
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }
}