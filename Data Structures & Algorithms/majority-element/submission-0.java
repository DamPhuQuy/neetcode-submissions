class Solution {
    public int majorityElement(int[] nums) {
        int threshold = nums.length / 2; 
        Map<Integer, Integer> count = new HashMap<>();

        for (int x : nums) {
            int newCount = count.getOrDefault(x, 0) + 1;
            if (newCount > threshold) 
                return x; 
            count.put(x, newCount); 
        }
        return -1; 
    }
}