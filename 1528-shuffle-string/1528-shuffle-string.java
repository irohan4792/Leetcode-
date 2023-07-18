class Solution {
    public String restoreString(String s, int[] indices) {
        char arr [] = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            arr[indices[i]] = s.charAt(i);
        }
        String res = "";
        for(char x : arr){
            res+=x;
        }
        return res;
    }
}