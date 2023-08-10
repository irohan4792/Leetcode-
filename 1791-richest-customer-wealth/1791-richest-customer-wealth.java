class Solution {
    public int maximumWealth(int[][] a) {
        int res = 0;
        for(int i = 0 ; i < a.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < a[0].length ; j++){
                sum += a[i][j];
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}