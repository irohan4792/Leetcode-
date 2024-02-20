class Solution {
    public int missingNumber(int[] nums) {
        int t = nums.length;
    for (int i = 0; i < nums.length; ++i)
      t ^= i ^ nums[i];

    return t;
    }
}