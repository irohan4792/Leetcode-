class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        Map<String, Integer> map = new HashMap<>();
        map.put("X++", x+1);
        map.put("++X", x+1);
        map.put("--X", x-1);
        map.put("X--", x-1);
        int res = 0;
        for(String n : operations){
            if(map.containsKey(n)){
                res+=map.get(n);
            }
        }
        return res;
    }
}