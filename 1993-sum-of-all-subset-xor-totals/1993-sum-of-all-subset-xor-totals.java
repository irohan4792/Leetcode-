// class Solution {
//     public int subsetXORSum(int[] nums) {
//         int r = 0;
//         int i = 0;
//         int res[] = new int[2*nums.length];
//         ArrayList<Integer> a = new ArrayList<>();
//         for(int j = 0 ; j < res.length ; j++){
//             res[j]=helper(a,nums,i);
//             r^=res[j];
//         }
//         return r;
//     }
//     public void helper(ArrayList<Integer> a, int nums[], int i){
//         int xor = 0;
//         if(i==nums.length){
//             a.add(nums[i]);
//             for(int k = 0 ; k < a.size() ; k++){
//                 xor^=a.get(k);
//             }
//             return xor;
//         }
//         a.add(nums[i]);
//         helper(a,nums,i+1);
//         a.remove(a.size()-1);
//         helper(a,nums,i+1);
        
//     }
// }


class Solution {
    public int subsetXORSum(int[] nums) {
        int res[] = new int[1];
        ArrayList<Integer> a = new ArrayList<>();
        helper(a, nums, 0, res);
        return res[0];
    }

    public void helper(ArrayList<Integer> a, int nums[], int i, int[] res) {
        if (i == nums.length) {
            int xor = 0;
            for (int k = 0; k < a.size(); k++) {
                xor ^= a.get(k);
            }
            res[0] += xor;
            return;
        }
        
        // Include the current element and explore the next element
        a.add(nums[i]);
        helper(a, nums, i + 1, res);
        a.remove(a.size() - 1); // Backtrack by removing the last added element
        
        // Exclude the current element and explore the next element
        helper(a, nums, i + 1, res);
    }
}
