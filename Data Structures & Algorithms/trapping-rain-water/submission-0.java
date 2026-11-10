class Solution {
    public int trap(int[] height) {
        int n = height.length; 

        int l = 0, r = n - 1; 

        int maxl = 0; 
        int maxr = 0; 

        int count = 0; 

        while (l < r) {
            if (height[l] < height[r]) {
                maxl = Math.max(maxl, height[l]); 
                count += maxl - height[l]; 
                l += 1; 
            } else {
                maxr = Math.max(maxr, height[r]); 
                count += maxr - height[r]; 
                r -= 1; 
            }
        }

        return count; 
    }
}
