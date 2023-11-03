class Solution {
    public List<String> buildArray(int[] target, int n) {
    List<String> res = new ArrayList<>();
    int i = 0;
    int num = 1;
    while(i<target.length){
        int t = target[i];
        if(t==num){
            res.add("Push");
            i+=1;
        }
        else{
            res.add("Push");
            res.add("Pop");
        }
        num+=1;
    }
        return res;
    }
}