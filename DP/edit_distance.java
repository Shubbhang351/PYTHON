import java.util.*;

class edit_distance {

    public static int EDRecursion1(String s1, String s2){
        if(s1.length() == 0 || s2.length() == 0){
            return Math.max(s1.length(), s2.length());
        }

        String ros1 = s1.substring(1);
        String ros2 = s2.substring(1);

        int ans = 0;
        if(s1.charAt(0) == s2.charAt(0)){
            ans = EDRecursion1(ros1, ros2);
        }
        else{
            int insert = EDRecursion1(ros1, s2);
            int delete = EDRecursion1(s1, ros2);
            int replace = EDRecursion1(ros1, ros2);

            ans = Math.min(insert, Math.min(delete, replace)) + 1;
        }

        return ans;
    }
    
    public static int EDRecursion2(String s1, String s2, int i, int j){

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
            ans = EDRecursion2(s1, s2, i + 1, j + 1);
        }
        else{
            int insert = EDRecursion2(s1, s2, i + 1, j);
            int delete = EDRecursion2(s1, s2, i, j + 1);
            int replace = EDRecursion2(s1, s2, i + 1, j + 1);

            ans = Math.min(insert, Math.min(delete, replace)) + 1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(EDRecursion1(s1, s2));

        System.out.println(EDRecursion2(s1, s2, 0, 0));
    }
}
