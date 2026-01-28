class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> idx = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            int n = nums[i];
            if(idx.containsKey(target-n)){
                return new int[] {i,idx.get(target-n)};
            }
            idx.put(n,i);
        }
        return new int[] {};
    }
}