class Solution {
    public int minDeletions(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        for(char c : s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        Set<Integer>set = new HashSet<>();
        int cnt = 0;
        for(int f : mp.values()){
            while(f>0 && set.contains(f)){
                f--;
                cnt++;
            }
            set.add(f);
        }
        return cnt;
    }
}