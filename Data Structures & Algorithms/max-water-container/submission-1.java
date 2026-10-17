class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length; 

        int low = 0; 
        int high = n - 1; 

        int max = -999; 
        int score = 0; 

        while (low < high) {
            int h = Math.min(heights[low], heights[high]); 

            int w = high - low; 

            score = h * w; 
            max = Math.max(score, max); 

            if (heights[low] < heights[high]) {
                low += 1;
            } else {
                high -= 1;
            }
        }

        return max; 
    }
}
