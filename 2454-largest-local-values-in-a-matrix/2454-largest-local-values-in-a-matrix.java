// class Solution {
//     int [][] grid;
//     public int[][] largestLocal(int[][] grid) {
//         this.grid = grid;
//         int n = grid.length;
//         int res[][] = new int[n-2][n-2];
//         for(int i = 0 ; i < grid.length-2 ; i++){
//             for(int j = 0 ; j < grid[0].length-2 ; j++){
//                 res[i][j]=getmax(i,j);
//             }
//         }
//         return res;
//     }
//     int getmax(int i, int j){
//         int res = Integer.MIN_VALUE;
//         int row = i+3;
//         int col = j+3;
//         for(int a = i ; i < row ; i++){
//             for(int b = j ; j < col ; j++){
//                 if(grid[a][b]>res){
//                     res=grid[a][b];
//                 } 
//             }
//         }
//         return res;
//     }
// }
class Solution {
    int[][] grid;

    public int[][] largestLocal(int[][] grid) {
        this.grid = grid;
        int n = grid.length;
        int m = grid[0].length;
        int res[][] = new int[n - 2][m - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < m - 2; j++) {
                res[i][j] = getmax(i, j);
            }
        }
        return res;
    }
    int getmax(int i, int j) {
        int max = Integer.MIN_VALUE; 
        int row = i + 3;
        int col = j + 3;
        for (int a = i; a < row; a++) {
            for (int b = j; b < col; b++) {
                if (grid[a][b] > max) {
                    max = grid[a][b];
                }
            }
        }
        return max;
    }
}
