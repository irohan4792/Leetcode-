class Solution {
    public int bestClosingTime(String customers) {
        int arr[] = {0,0,0};
        for(int i = 0 ; i < customers.length() ; ++i){
            arr = (arr[0]<(arr[2] +=(customers.charAt(i)=='Y') ? 1 : -1)) ? new int[]{arr[2], i+1, arr[2]} : arr;
        }
        return arr[1];
    }
}