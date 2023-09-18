class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map <Integer, Integer> mp = new TreeMap<>();
        for(int i = 0 ; i < mat.length ; i++){
            int c= 0;
            for(int j = 0 ; j < mat[i].length ; j++){
                if(mat[i][j]==1) c++;
            } 
            mp.put(i,c);
        }
        return mp.entrySet().stream().sorted(Map.Entry.comparingByValue()).limit(k).map(Map.Entry::getKey).mapToInt(it->it).toArray();
    }
}