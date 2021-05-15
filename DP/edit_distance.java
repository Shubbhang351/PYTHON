import java.util.*;

class edit_distance {
    
    public static int EDRecursion(String s1, String s2, int i, int j){

        // if(i == s1.length() && j < s2.length()){
        //     return s2.length() - j;
        // }

        // if(j == s2.length() && i < s1.length()){
        //     return s1.length() - i;
        // }

        // if(i == s1.length() && j == s2.length()){
        //     return 0;
        // }

        if(i == s1.length() || j == s2.length()){
            return Math.max(s1.length() - i, s2.length() - j);
        }

        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = EDRecursion(s1, s2, i + 1, j + 1);
        }
        else{
            int insert = EDRecursion(s1, s2, i + 1, j);
            int delete = EDRecursion(s1, s2, i, j + 1);
            int replace = EDRecursion(s1, s2, i + 1, j + 1);

            ans = Math.min(insert, Math.min(delete, replace)) + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(EDRecursion(s1, s2, 0, 0));
    }
}
