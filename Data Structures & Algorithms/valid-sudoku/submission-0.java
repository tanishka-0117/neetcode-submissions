class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s =  new HashSet();

        for(int i = 0;i<9 ; i++){
            for(int j = 0;j<9;j++){
               char num = board[i][j];

               if(num == '.'){
                 continue;
               }

               String row = num + "row in " + i;
               String col = num + "col in" + j;
               String box = num + "box in" + (i/3) + "-" + (j/3);

               if(!s.add(row) || !s.add(col) || !s.add(box)){
                return false;
               }
            }
        }

        return true;
    }
}
