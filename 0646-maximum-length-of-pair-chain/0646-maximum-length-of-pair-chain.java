class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1],b[1]));
        int cnt = 0;
        System.out.println(pairs);
        int cur = Integer.MIN_VALUE;
        for(int pair[] : pairs){
            if(cur<pair[0]){
                cur = pair[1];
                cnt++;
            }
        }
        return cnt;
    }
}