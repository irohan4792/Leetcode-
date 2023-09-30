class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;
        }

        int[] minPrefix = new int[n];
        minPrefix[0] = nums[0];

        // Find the minimum element in the prefix of the array
        for (int i = 1; i < n; i++) {
            minPrefix[i] = Math.min(minPrefix[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();

        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > minPrefix[j]) {
                // We have found a potential '2' (nums[j])
                // Now, we look for '3' (an element greater than minPrefix[j]) in the stack
                while (!stack.isEmpty() && stack.peek() <= minPrefix[j]) {
                    stack.pop();
                }
                // If we found a '3', return true
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                // Otherwise, push nums[j] onto the stack as a potential '3'
                stack.push(nums[j]);
            }
        }

        return false;
    }
}
