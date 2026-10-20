class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder(); 

        int index1 = 0; 
        int index2 = 0; 

        while (index1 < word1.length() && index2 < word2.length()) {
            res.append(word1.charAt(index1)); 
            res.append(word2.charAt(index2)); 
            index1 += 1; 
            index2 += 1; 
        }

        while (index1 < word1.length()) {
            res.append(word1.charAt(index1)); 
            index1 += 1;
        }

        while (index2 < word2.length()) {
            res.append(word2.charAt(index2)); 
            index2 += 1;
        }

        return res.toString(); 
    }
}