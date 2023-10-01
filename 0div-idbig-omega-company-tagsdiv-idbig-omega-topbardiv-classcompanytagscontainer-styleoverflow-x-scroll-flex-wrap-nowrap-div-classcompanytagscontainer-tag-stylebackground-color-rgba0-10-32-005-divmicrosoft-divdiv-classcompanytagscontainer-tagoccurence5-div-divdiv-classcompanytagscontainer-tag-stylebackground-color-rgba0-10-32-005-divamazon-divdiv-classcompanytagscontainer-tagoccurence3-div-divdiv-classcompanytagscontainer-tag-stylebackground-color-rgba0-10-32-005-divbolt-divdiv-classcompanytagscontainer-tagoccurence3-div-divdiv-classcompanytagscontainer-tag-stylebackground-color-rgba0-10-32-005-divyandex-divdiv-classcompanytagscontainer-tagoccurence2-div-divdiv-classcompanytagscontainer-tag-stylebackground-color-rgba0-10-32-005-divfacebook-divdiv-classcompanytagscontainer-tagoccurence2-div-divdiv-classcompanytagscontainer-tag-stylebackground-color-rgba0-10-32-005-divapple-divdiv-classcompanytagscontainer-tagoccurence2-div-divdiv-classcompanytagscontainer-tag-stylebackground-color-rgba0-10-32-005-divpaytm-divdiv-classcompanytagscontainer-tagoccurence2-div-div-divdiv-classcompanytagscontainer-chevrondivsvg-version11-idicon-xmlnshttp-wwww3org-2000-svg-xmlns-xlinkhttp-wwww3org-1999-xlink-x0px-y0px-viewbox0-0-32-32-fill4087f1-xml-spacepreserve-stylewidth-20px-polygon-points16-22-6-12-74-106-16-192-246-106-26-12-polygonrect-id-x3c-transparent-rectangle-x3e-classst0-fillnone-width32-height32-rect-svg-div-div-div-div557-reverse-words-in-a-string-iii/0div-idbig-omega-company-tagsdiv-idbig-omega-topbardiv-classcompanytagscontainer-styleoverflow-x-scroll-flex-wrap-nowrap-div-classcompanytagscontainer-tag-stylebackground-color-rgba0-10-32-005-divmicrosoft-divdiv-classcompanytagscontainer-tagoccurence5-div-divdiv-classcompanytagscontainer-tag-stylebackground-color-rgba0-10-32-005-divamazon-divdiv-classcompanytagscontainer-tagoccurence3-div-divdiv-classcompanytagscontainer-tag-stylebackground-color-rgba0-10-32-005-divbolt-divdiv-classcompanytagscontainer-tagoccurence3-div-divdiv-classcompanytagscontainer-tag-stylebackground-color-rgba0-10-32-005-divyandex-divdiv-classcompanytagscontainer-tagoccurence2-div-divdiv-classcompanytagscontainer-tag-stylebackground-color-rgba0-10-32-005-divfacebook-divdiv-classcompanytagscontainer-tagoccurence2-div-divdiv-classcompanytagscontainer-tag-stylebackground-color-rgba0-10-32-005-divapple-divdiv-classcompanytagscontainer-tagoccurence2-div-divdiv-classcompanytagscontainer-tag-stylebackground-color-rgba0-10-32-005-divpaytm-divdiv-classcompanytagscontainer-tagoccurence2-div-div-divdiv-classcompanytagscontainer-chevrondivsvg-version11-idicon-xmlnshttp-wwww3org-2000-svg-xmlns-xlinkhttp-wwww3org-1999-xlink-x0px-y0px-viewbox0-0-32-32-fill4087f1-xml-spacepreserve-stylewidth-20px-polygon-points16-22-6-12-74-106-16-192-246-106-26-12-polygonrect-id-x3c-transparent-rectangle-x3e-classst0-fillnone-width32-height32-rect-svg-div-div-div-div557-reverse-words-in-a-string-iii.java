class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int left = 0;
        int right;
        for(right=0 ; right<=arr.length ; right++){
            if(right==arr.length || arr[right]==' '){
                rev(arr,left,right-1);
                left=right+1;
            }
        }
        return new String(arr);
    }
    public void rev(char s[] , int start, int end){
        while(start<end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++; end--;
        }
    }
}