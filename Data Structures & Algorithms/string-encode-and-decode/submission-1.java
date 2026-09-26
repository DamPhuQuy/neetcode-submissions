public class Solution {

    public String encode(List<String> strs) {
        if (strs == null) return "";

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int specialIndex = str.indexOf("#", i); 
            int amount = Integer.valueOf(str.substring(i, specialIndex)); 

            int start = specialIndex + 1; 
            int end = start + amount;  

            result.add(str.substring(start, end)); 
            i = end; 
        }

        return result;
    }
}