class Solution {
    public int[][] generateMatrix(int n) {
        int res[][] = new int[n][n];
        int val = 1;
        int mid = n/2;
        for(int i = 0 ; i<mid ; i++){
            int last = n-i-1;
            for(int k = i; k<last; k++){
                res[i][k] = val++;
            }
            for(int k = i; k<last; k++){
                res[k][last] = val++;
            }
            for(int k =last; k>i;k--){
                res[last][k] = val++;
            }
            for(int k=last; k>i;k--){
                res[k][i]= val++;
            }
        }
        if(n%2 == 1) res[n/2][n/2] = val;
        return res;
        }

    }
