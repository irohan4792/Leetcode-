class Solution {
    public int romanToInt(String s) {
        int roman[] = {1,5,10,50,100,500,1000};
        char str[]  = {'I','V','X','L','C','D','M'};

        int res = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int cur = roman[getIndex(str, s.charAt(i))];
            int nex = (i+1 < s.length()) ? roman[getIndex(str, s.charAt(i+1))] : 0;

            if(cur < nex) res -= cur;
            else res += cur;
        }
        return res;
    }

    private int getIndex(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1; // not found
    }
}
