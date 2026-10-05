class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] cols = new boolean[9][9]; 
        boolean[][] rows = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9]; 

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j]; 
                if (c == '.') continue; 

                int val = c - '1'; 

                int idxBox = (i / 3 * 3) + j/3; 

                if (rows[i][val] || cols[j][val] || boxes[idxBox][val]) {
                    return false; 
                }

                rows[i][val] = true; 
                cols[j][val] = true; 
                boxes[idxBox][val] = true; 
            }
        }

        return true; 
    }
}
