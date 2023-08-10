class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for(int i = 0 ; i < word1.length() ; i++){
            char a = word1.charAt(i);
            char b = word2.charAt(i);
            m1.put(a,m1.getOrDefault(a,0)+1);
            m2.put(b,m2.getOrDefault(b,0)+1);
        }
        for(char i : m1.keySet()){
            if(!m2.containsKey(i)) m2.put(i,0);
            if(m1.get(i)-m2.get(i)>3) return false;
        }
        for(char j : m2.keySet()){
            if(!m1.containsKey(j)) m1.put(j,0);
            if(m2.get(j)-m1.get(j)>3) return false;
        }
        return true;
    }
}