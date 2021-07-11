import java.util.*;

class Recursio{
    public static void main(String[] args) {
        // validParanthesis1(2, 0, 0, "");
        // climbingStairs(3, 0, "");
        // mazePath(2,2, 0, 0, "");
        // allPermutations("abc", new boolean["abc".length()], "");
        allPermutations("abc", "");
    }

    public static void validParanthesis(int n,int open_bracket, int close_bracket,String ans){
        if(open_bracket == n && close_bracket == n){
            System.out.println(ans);
            return;
        }

        if(open_bracket < n){
            validParanthesis(n, open_bracket + 1, close_bracket, ans + "(");
        }

        if(close_bracket < open_bracket){
            validParanthesis(n, open_bracket, close_bracket + 1, ans + ")");
        }
    }

    public static void validParanthesis1(int n,int open_bracket, int close_bracket,String ans){
        // +ve base case
        if(open_bracket == n && close_bracket == n){
            System.out.println(ans);
            return;
        }

        // -ve base case
        if(open_bracket > n || close_bracket > open_bracket){
            return;
        }

        validParanthesis1(n, open_bracket + 1, close_bracket, ans + "(");

        validParanthesis1(n, open_bracket, close_bracket + 1, ans + ")");

    }

    public static void climbingStairs(int n,int current_stair,String ans){
        if(current_stair == n){
            System.out.println(ans);
            return;
        }

        if(current_stair > n){
            return;
        }

        climbingStairs(n, current_stair + 1, ans + "1");
        climbingStairs(n, current_stair + 2, ans + "2");
        climbingStairs(n, current_stair + 3, ans + "3");
    }

    public static void mazePath(int end_row,int end_col,int row,int col,String ans){
        if(row == end_row && col == end_col){
            System.out.println(ans);
            return;
        }

        if(row > end_row || col > end_col){
            return;
        }

        mazePath(end_row, end_col, row, col + 1, ans + "H");
        mazePath(end_row,end_col, row + 1, col, ans + "V");
    }

    public static void allPermutations(String s,boolean[] chois,String ans){
        if(ans.length() == s.length()){
            System.out.println(ans);
            return;
        }

        for(int i = 0;i < chois.length;i++){
            if(chois[i] == false){
                chois[i] = true;
                allPermutations(s, chois, ans + s.charAt(i));
                chois[i] = false;
            }
        }
    }

    public static void allPermutations(String s,String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0;i < s.length();i++){
            String new_str = s.substring(0,i) + s.substring(i + 1);
            allPermutations(new_str, ans + s.charAt(i));
        }
    }

}