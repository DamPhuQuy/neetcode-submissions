class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> count = new HashMap<Integer, Integer>(); 
        
        for (int i = 0; i < nums.length; i++) {
            if (count.containsKey(nums[i])) {
                return true;
            }
            count.merge(nums[i], 1, Integer::sum); 
        }
        return false;
    }
}