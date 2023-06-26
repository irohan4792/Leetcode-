import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> main = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        recursion(nums, 0, subset, main);
        return main;
    }
    public void recursion(int[] nums, int index, List<Integer> subset, List<List<Integer>> main) {
        if (index == nums.length) {
            main.add(new ArrayList<>(subset));
            return;
        }
        recursion(nums, index + 1, subset, main);
        subset.add(nums[index]);
        recursion(nums, index + 1, subset, main);
        subset.remove(subset.size() - 1);
    }
}
