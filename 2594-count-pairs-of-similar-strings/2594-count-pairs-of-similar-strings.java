class Solution {
    public int similarPairs(String[] words) {
        int cnt = 0;
        for(int i = 0 ; i < words.length ; i++){
            String s = words[i];
            HashSet<Character>set = new HashSet<>();
            for(int j = 0 ; j < s.length() ; j++){
                set.add(s.charAt(j));
            }
            char a[] = new char[set.size()];
            Iterator<Character>itr = set.iterator();
            String t = "";
            while(itr.hasNext()){
                t+=Character.toString(itr.next());
            }
            words[i]=t;
        }
        for(int i = 0 ; i < words.length-1 ; i++){
            for(int j = i+1 ; j < words.length ; j++){
                if(words[i].equals(words[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}