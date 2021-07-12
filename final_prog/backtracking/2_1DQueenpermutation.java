import java.util.*;

class Queen1D{
    public static void main(String[] args) {
        int tq = 2; // total no. of Queens

        int qpsf = 0; // queen placed so far

        String ans = ""; // answer

        boolean[] board = new boolean[4]; // true -> queen is placed i that box, false -> box is empty

        queenPermutation(board, tq, qpsf, ans);
    }

    public static void queenPermutation(boolean[] board,int tq,int qpsf,String ans){
        if(tq == qpsf){
            System.out.println(ans);
            return;
        }

        for(int i = 0;i < board.length;i++){
            if(board[i] == false){
                board[i] = true; // place queen at box[i].
                queenPermutation(board, tq, qpsf + 1, ans + "q" + qpsf + "b" + i + " ");
                board[i] = false; // unplace queen at box[i] or UNDO step
            }
        }
    }


}