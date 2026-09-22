class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> filter = new HashMap<>(); 

        for (String s : strs) {
            char[] chars = s.toCharArray();

            Arrays.sort(chars); 

            String sorted = new String(chars); 

            if (!filter.containsKey(sorted)) {
                filter.put(sorted, new ArrayList<String>()); 
            } 
            filter.get(sorted).add(s); 
        }
        
        return new ArrayList<>(filter.values()); 
    }
}
