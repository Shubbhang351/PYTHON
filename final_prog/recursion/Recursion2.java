class Recursion2{
    public static void main(String[] args) {
        // subsequence("abc", "", 0);
        permutation("abc", "", new boolean["abc".length()]);
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
}