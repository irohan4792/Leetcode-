class Solution {
    public void gameOfLife(int[][] board) {
        if(board==null || board.length == 0) return;
        int len = board.length, row = board[0].length;
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < row ; j++){
                int temp = helper(board, len, row, i, j);
                if(board[i][j]==1 && temp>=2 && temp<=3) board[i][j]=3;
                if(board[i][j]==0 && temp==3) board[i][j]=2; 
            }
        }
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < row ; j++){
                board[i][j]>>=1;
            }
        }
    }
    int helper(int [][]board, int m, int n, int i, int j){
        int temp = 0;
        for(int a = Math.max(i-1, 0) ; a <= Math.min(i+1,m-1) ; a++){
            for(int b = Math.max(j-1,0) ; b <= Math.min(j+1,n-1) ; b++){
                temp+=board[a][b]&1;
            }
        }
        temp-=board[i][j]&1;
        return temp;
    }
}