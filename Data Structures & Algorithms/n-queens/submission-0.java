class Solution {
    private boolean isValid(int row , int col , char[][] board , int n){
        int r = row ;
        int c = col;
        while(r >= 0){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
        }
        r= row;
        c = col;

        while( r>= 0 && c>= 0){
          if(board[r][c] == 'Q'){
            return false;
          }
          r--;
          c--;
        }
        r = row;
        c = col;
        while(r >=0 && c < n){
            if(board[r][c] == 'Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    private void helper(int row , char[][] board ,List<List<String>> res , int n){
        if(row == n){
            res.add(construct(board ,n));
            return;
        }
        for(int i =0;i<n;i++){
            if(isValid(row , i , board ,n)){
              board[row][i]='Q';
            helper(row+1,board , res ,n);
            board[row][i] = '.';
            }
           
        }

    }
    
    private List<String> construct(char[][] board, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new String(board[i]));
        }
        return list;
    }

    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();

        helper(0, board, res, n);

        return res;

    }
}