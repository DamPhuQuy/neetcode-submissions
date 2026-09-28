class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1; 
        int count = -1; 
        while (left <= right) {
            if (count == 0) {
                return false; 
            }

            char l = s.charAt(left); 
            char r = s.charAt(right); 

            if (l != r) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            left += 1; 
            right -= 1; 
        }
        return true; 
    }

    private boolean isPalindrome(String s, int left, int right) {
    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}
}