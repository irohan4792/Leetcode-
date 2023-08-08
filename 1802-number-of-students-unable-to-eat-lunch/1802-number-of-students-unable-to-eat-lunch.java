class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int one = 0;
        int zero = 0;
        for(int i : students){
            if(i == 0) zero++;
            else one++;
        } 
        for (int j : sandwiches){
            if(j==0){
                if(zero==0){
                    return one;
                }
                zero--;
            }
            else{
                if(one==0){
                    return zero;
                }
                one--;
            }
        }
        return 0;
    }
}