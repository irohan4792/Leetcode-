class Solution {
    public int findPeakElement(int[] nums) {
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            al.add(nums[i]);
        }
        int max = Collections.max(al);
        return al.indexOf(max);
    }
}