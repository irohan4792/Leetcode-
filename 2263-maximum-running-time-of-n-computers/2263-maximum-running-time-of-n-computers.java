class Solution {
    public long maxRunTime(int n, int[] batteries) {
        Arrays.sort(batteries);
        long low = 1;
        long hi = (long) Arrays.stream(batteries).asLongStream().sum()/n;
        while(low<hi){
            long mid = hi-(hi-low)/2;
            long temp = Arrays.stream(batteries).asLongStream().map( battery -> Math.min(battery,mid) ).sum();
            if(temp>=mid*n){
                low=mid;
            }
            else{
                hi=mid-1;
            }
        }
        return low;
    }
}