class Solution {
    public int[] findEvenNumbers(int[] digits) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0 ; i < digits.length ; i++){
            if(digits[i]==0) continue;
            for(int j = 0 ; j < digits.length ; j++){
                if(i==j) continue;
                for(int k = 0 ; k < digits.length ; k++){
                    if(i==k || j==k || digits[k] % 2 == 1) continue;
                    int temp = 100*digits[i] + 10*digits[j] + digits[k];
                    ts.add(temp);
                }
            }
        }
        int [] res = new int[ts.size()];
        int i = 0;
        for(int j : ts){
            res[i]=j;
            i++;
        }
        return res;
    }
}