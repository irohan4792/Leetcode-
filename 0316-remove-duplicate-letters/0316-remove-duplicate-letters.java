class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int index = currentChar - 'a';

            if (visited[index]) {
                continue;
            }

            while (!stack.isEmpty() && currentChar < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                visited[stack.pop() - 'a'] = false;
            }

            stack.push(currentChar);
            visited[index] = true;
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop());
        }

        return result.toString();
    }
}
