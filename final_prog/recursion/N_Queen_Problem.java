import java.util.*;

class Queen{
    public static int count = 0;
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        nQueen(4, board, 0);
        System.out.println(count);
    }

    public static void nQueen(int n,boolean[][] board,int row){
        if(row == n - 1){
            count++;
            return;
        }

        for(int j = 0;j <= n;j++){
            if(board[row][j] == false && check(board, row, j)){
                board[row][j] = true;
                nQueen(n, board, row + 1);
                board[row][j] = false;
            }
        }
    }

    public static boolean check(boolean[][] board,int row,int col){
        int r = row;
        int c = col;
        // up
        for(int i = 0;i < r;i++){
            if(board[r][c]){
                return false;
            }
        }


        // up left diagonal
        r = row - 1;
        c = col - 1;

        while(r >= 0 && c >= 0){
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        // up right diagonal
        r = row - 1;
        c = col + 1;
        while(r >= 0 && c < board[0].length){
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
}