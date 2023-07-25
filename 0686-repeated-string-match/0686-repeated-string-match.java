class Solution {
    public int repeatedStringMatch(String a, String b) {
        String dupa = a;
        int count = 1;
        int round = b.length()/a.length();
        for(int i = 0 ; i < round+2; i++){
            if (a.contains(b)) return count;
            else {
                a+=dupa;
                count++;
            }
        }
        return -1;
    }
}