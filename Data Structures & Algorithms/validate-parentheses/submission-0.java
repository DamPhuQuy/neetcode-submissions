class Solution {
    public boolean isValid(String s) {
        Stack<Character> store = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                store.push(c);
            } 
            else if (c == ')' || c == ']' || c == '}') {
                if (store.isEmpty()) {
                    return false;
                }

                char top = store.pop();

                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return store.isEmpty();
    }
}