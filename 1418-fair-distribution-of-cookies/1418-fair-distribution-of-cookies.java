class Solution {
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        helper(cookies,0,k,new int[k]);
        return res;
    }
    void helper(int [] cookies, int index, int k, int [] tem){
        if(index==cookies.length){
            int max = 0;
            for(int i : tem)
                max = Math.max(max, i);
            res=Math.min(res, max);
            return;
        }
        for(int i = 0 ; i < k ; i++){
            tem[i] += cookies[index];
            helper(cookies, index+1, k, tem);
            tem[i] -= cookies[index];
        }
    }
}