class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length; 

        Arrays.sort(nums); 

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }

            int low = i + 1;
            int high = n - 1; 

            int current = nums[i]; 
            while (low < high) {
                if (current == -(nums[low] + nums[high])) {
                    List<Integer> store = new ArrayList<>(); 
                    store.add(current); 
                    store.add(nums[low]); 
                    store.add(nums[high]);
                    res.add(store);  

                    while (low < high && nums[low] == nums[low + 1]) low += 1; 
                    while (low < high && nums[high] == nums[high - 1]) high -= 1;

                    low += 1; 
                    high -= 1; 
                } else if (current < -(nums[low] + nums[high])) {
                    low += 1;
                } else {
                    high -= 1;
                }
            }
        }

        return res; 
    }
}
