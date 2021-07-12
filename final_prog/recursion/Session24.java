import java.util.*;

class Recursion{
    public static void main(String[] args) {
        // coinToss2(3,false, "");
        // lexo(0, 10);
        // jumpingNumbers(105, 0);
        palindromePartitions("nitin", "");
    }


    // coinToss with no consecutive Head
    public static void coinToss2(int n,String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H'){
            coinToss2(n - 1, ans + "H");
        }
        coinToss2(n - 1, ans + 'T');
    }

    public static void coinToss2(int n,boolean head,String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }

        if(!head){
            coinToss2(n - 1, true, ans + 'H');
        }
        coinToss2(n - 1,false, ans + 'T');
    }

    public static void lexo(int k, int n){
        if(k > n){
            return;
        }
        if(k == 0){
            System.out.print(k + " ");
            for(int i = 1;i <= 9;i++){
                lexo(k * 10 + i, n);
            }
            return;
        }
        System.out.print(k + " ");
        for(int i = 0;i <= 9;i++){
            lexo(k * 10 + i, n);
        }
    }

    public static void jumpingNumbers(int n,int i){
        if(i > n){
            return;
        }
        if(i == 0){
            System.out.println(i);
            for(int j = 1;j <= 9;j++){
                jumpingNumbers(n, j);
            }
        }
        else{

        System.out.println(i);

        if((i % 10) != 0)
            jumpingNumbers(n, i * 10 +((i % 10) - 1));
        if((i % 10) != 9)
            jumpingNumbers(n, i * 10 + ((i % 10) + 1));
        }
    }

    public static void palindromePartitions(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }


        for(int i = 1;i <= ques.length();i++){

            String part = ques.substring(0,i);

            String roq = ques.substring(i);

            if(isPalindrome(part)){
                palindromePartitions(roq, ans + part + " ");
            }
        }
    }

    public static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}