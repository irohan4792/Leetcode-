class Solution {
    public int xorOperation(int n, int start) {
        int res = 0;
        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for(int i = start ; i < n+start ; i++){
            temp.add(start+2*j);
            j++;
        }

        for(int i = 0 ; i < temp.size() ; i++){
            res = res ^ temp.get(i);
        }
        return res;
    }
}