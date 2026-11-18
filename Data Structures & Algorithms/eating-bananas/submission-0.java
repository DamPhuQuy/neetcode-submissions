class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // eat one pile at a time 
        // k ~ bananas-per-hour
        
        // time to eat:
        // > k: piles[i] / k = time (ceiling round) 
        // e.g: 3 / 2 = ceil(1.5) = 2
        // <= k: time = k = piles[i]
        // ceil(piles[i] / k) is correct in every cases

        // h = sum of ceil(piles[i] / k) 
        // k increases, h decreases 
        // k = 1, h = 10 (invalid)
        // k = 2, h = 6 (valid) -> minimum
        // ... k = 4 (valid)
        // k depends on (1, max(piles)) 

        // find minimum k in piles, that is within h
        int n = piles.length;   

        int max = -999;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, piles[i]); 
        }

        int low = 1, high = max; 
        int ans = max;
        while (low <= high) {
            int k = low + (high - low) / 2; 
            long total = 0; 
            for (int i = 0; i < n; i++) {
                total += (piles[i] + k - 1) / k; 
            }

            if (total > h) {
                low = k + 1; 
            } else {
                ans = k;     
                high = k - 1;
            }
        }

        return ans;
    }
}
