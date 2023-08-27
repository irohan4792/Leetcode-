class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        int n = stones.length;
        for(int i = 0 ; i < n ; i++){
            hm.put(stones[i], new HashSet<Integer>());
        }
        hm.get(stones[0]).add(0);
        for(int i = 0 ; i < n ; i++){
            int stone = stones[i];
            HashSet<Integer> set = hm.get(stone);
            for(int val : set){
                if(hm.containsKey(stone+val-1)){
                    if(val-1>0) hm.get(stone+val-1).add(val-1);
                }
                if(hm.containsKey(stone+val)){
                    if(val>0) hm.get(stone+val).add(val);
                }
                if(hm.containsKey(stone+val+1)){
                    hm.get(stone+val+1).add(val+1);
                }
            }
        }
        if(hm.get(stones[n-1]).size()>0) return true;
        return false;
    }
}