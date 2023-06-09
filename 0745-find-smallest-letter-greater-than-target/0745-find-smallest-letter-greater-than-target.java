class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int start = 0;
        int end = len - 1;
        char let = letters[start];
        while (start <= end){
            int mid = (start + end)/2;
            if(target<letters[mid]){
                let = letters[mid];
                end = mid -1;
            }
            else{
                start = mid + 1; 
            }
        }
        return let;
    }
}