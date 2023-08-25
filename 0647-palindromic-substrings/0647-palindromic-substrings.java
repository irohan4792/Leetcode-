// class Solution {
//     public int countSubstrings(String s) {
//         int cnt = 0;
//         for(int i = 0 ; i < s.length() ; i++){
//             for(int j = i+1 ; i <= s.length()-1 ; j++){
//                 String str = s.substring(i,j);
//                 if(helper(str)==true) cnt++;
//             }
//         }
//         return cnt;
//     }
//     boolean helper(String s){
//         int i = 0;
//         int j = s.length()-1;
//         while(i<=j){
//             char a = s.charAt(i);
//             char b = s.charAt(j);
//             if(a!=b) return false;
//             else{
//                 i++; j--;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public int countSubstrings(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) { // Changed "i" to "j"
                String str = s.substring(i, j);
                if (helper(str) == true) cnt++;
            }
        }
        return cnt;
    }
    
    boolean helper(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (a != b) return false;
            else {
                i++;
                j--;
            }
        }
        return true;
    }
}
