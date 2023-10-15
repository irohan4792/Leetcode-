class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0 ; i < seats.length ; i++){
                al.add(Math.abs(seats[i]-students[i]));
        }
        int res = 0;
        for(int i = 0 ; i < al.size() ; i++){
            res+=al.get(i);
        }
        return res;
    }
}