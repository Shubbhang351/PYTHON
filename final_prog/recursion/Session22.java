import java.util.*;

// Session22

class Recursion{
    public static void main(String[] args) {
        // subsequences("abc", "");
        // subsequences("abc", 0, "");
        // subsequences_With_ASCII("ab", 0, "");
        // coinToss(3, "");
        validParanthesis(3, 0, 0, "");
    }

    public static void subsequences(String ques,String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);
        subsequences(roq, ans);
        subsequences(roq, ans + ch);
    }

    public static void subsequences(String s,int i,String ans){
        if(i == s.length()){
            System.out.println(ans);
            return; 
        }

        subsequences(s, i + 1, ans + s.charAt(i));
        subsequences(s, i + 1, ans);
    }

    public static void subsequences_With_ASCII(String ques,int i,String ans){
        if(i == ques.length()){
            System.out.println(ans);
            return;
        }

        subsequences_With_ASCII(ques, i + 1, ans);
        subsequences_With_ASCII(ques, i + 1, ans + ques.charAt(i));
        subsequences_With_ASCII(ques, i + 1, ans + (int)ques.charAt(i));
    }

    public static void coinToss(int n,String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        coinToss(n - 1, ans + "H");
        coinToss(n - 1, ans + "T");
    }

    public static void validParanthesis(int n,int ob,int cb,String ans){
        if(ob == n && cb == n){
            System.out.println(ans);
            return;
        }

        if(ob < n){
            validParanthesis(n, ob + 1, cb, ans + "(");
        }

        if(cb < ob){
            validParanthesis(n, ob, cb + 1, ans + ")");
        }
    }
}