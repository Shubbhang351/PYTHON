class Recursion2{
    public static void main(String[] args) {
        // subsequence("abc", "", 0);
        // permutation("abc", "", new boolean["abc".length()]);
        // permutation2("abc", "");

        // generate_balance_bracket
        // generate_balance_bracket(3);

        lexographically2(100, 0);
    }

    public static void subsequence(String s , String ans, int i){
        if(i == s.length()){
            System.out.println(">> "+ ans);
            return;
        }

        subsequence(s, ans + s.charAt(i), i + 1);
        subsequence(s, ans, i + 1);
    }

    public static void permutation(String s, String ans,boolean[] choices){
        if(ans.length() == s.length()){
            System.out.println(ans);
            return;
        }

        for(int i = 0;i < choices.length;i++){
            if(choices[i] == false){
                choices[i] = true;
                permutation(s, ans + s.charAt(i), choices);
                choices[i] = false;
            }
        }
    }

    public static void permutation2(String s, String ans){
        if(s.length() == 0){
            System.out.println(">> " + ans);
            return;
        }

        for(int i = 0;i < s.length();i++){
            String s_new = s.substring(0,i) + s.substring(i + 1);
            permutation2(s_new, ans + s.charAt(i));
        }
    }

    public static void generate_balance_bracket(int n){
        int open_bracket = 0;
        int close_bracket = 0;
        generate_balance_bracket(open_bracket, close_bracket,"", n);
    }

    public static void generate_balance_bracket(int ob, int cb,String ans,  int n){
        if(ob == n && cb == n){
            System.out.println(ans);
            return;
        }

        if(ob < n){
            generate_balance_bracket(ob + 1, cb,ans + "(", n);
        }

        if(cb  < ob){
            generate_balance_bracket(ob, cb + 1,ans + ")", n);
        }
    }

    public static void lexographically(int n, int k){
        if(k > n){
            return;
        }

        if(k == 0){
            System.out.println(0);
            for(int i = 1;i <= 9;i++){
                lexographically(n, i);
            }
            return;
        }

        System.out.println(k);
        for(int i = 0;i <= 9;i++){
            lexographically(n,k * 10 + i);
        }
    }

    public static void lexographically2(int end, int initial){
        if(initial > end){
            return;
        }

        System.out.println(initial);
        int i = 0;
        if(initial == 0){
            i = 1;
        }
        while(i <= 9){
            lexographically2(end, initial * 10 + i);
            i++;
        }
    }
}