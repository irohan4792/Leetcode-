class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int maxalt = -99999;
        for(int i = 0 ; i < gain.length ; i++){
            altitude += gain[i];
            if(altitude>maxalt){
                maxalt = altitude;
            }
        }
        if(maxalt<0){
            return 0;
        }
        return maxalt;
    }
}