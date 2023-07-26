class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        if(dist.length-1>=hour) return -1;
        int left = 1;
        int right = (int) 10e7;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(helper(mid,dist,hour)) right=mid-1;
            else left=mid+1;
        }
        return left;
    }
    boolean helper( int speed, int dist[], double hour){
        double time = 0;
        for(int i = 0 ; i < dist.length-1 ; i++){
            time += dist[i]/speed;
            time += (dist[i]%speed==0) ? 0 : 1;  
        }
        time += dist[dist.length-1]*1.0/speed;
        return time<=hour;
    }
}