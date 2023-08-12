class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> al = new ArrayList<>();
    
        for(int i : nums){
            if(i < pivot){
                al.add(i);
            }
        }
        for(int i : nums){
            if(i==pivot) al.add(i);
        }
        for(int i : nums){
            if(i>pivot) al.add(i);
        }
        int arr [] = new int[al.size()];
        for(int i = 0 ; i < al.size() ; i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}