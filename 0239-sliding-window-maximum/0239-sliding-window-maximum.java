class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r=0;
        Deque<Integer> d = new ArrayDeque<>();
        while(r<nums.length){
            while(!d.isEmpty()&&nums[r]>nums[d.peekLast()]){
                d.pollLast();
            }
            d.offerLast(r);
            if(l>d.peekFirst()){
                d.pollFirst();
            }
            if(r+1>=k){
                res.add(nums[d.peekFirst()]);
                l++;
            }
            r++;
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}