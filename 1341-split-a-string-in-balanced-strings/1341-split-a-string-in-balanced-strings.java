class Solution {
    public int balancedStringSplit(String s) {
        int cnt = 0;
        int bal=0;
        int balance = 0; // Variable to keep track of the balance of 'r' and 'l' characters

        for (Character c : s.toCharArray()) {
            if (c == 'R') {
                bal++;
            } else if (c == 'L') {
                balance++;
            }

            if (bal==balance) {
                cnt++;
                bal=0;
                balance=0;
            }
        }

        return cnt;
    }
}
