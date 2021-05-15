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

    public static int EDtopDown(String s1, String s2, int i, int j, int[][] strg){


        if(i == s1.length() || j == s2.length()){
            return Math.max(s1.length() - i, s2.length() - j);
        }

        if(strg[i][j] != -1){
            return strg[i][j];
        }

        int ans = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = EDtopDown(s1, s2, i + 1, j + 1, strg);
        }
        else{
            int insert = EDtopDown(s1, s2, i + 1, j, strg);
            int delete = EDtopDown(s1, s2, i, j + 1, strg);
            int replace = EDtopDown(s1, s2, i + 1, j + 1, strg);

            ans = Math.min(insert, Math.min(delete, replace)) + 1;
        }

        strg[i][j] = ans;

        return ans;
    }


    public static int EDbottomUP(String s1, String s2) {
        int strg[][] = new int[s1.length() + 1][s2.length() + 1];

        // fill last row
        for(int i = 0;i < strg[s1.length()].length ; i++){
            strg[s1.length()][i] = s2.length() - i;
        }

        // fill last column
        for(int i = 0;i < strg.length ; i++){
            strg[i][s2.length()] = s1.length() - i;
        }

        for(int row = s1.length() - 1; row >= 0 ; row--){
            for(int col = s2.length() - 1; col >= 0;col--){
                if(s1.charAt(row) == s2.charAt(col)){
                    strg[row][col] = strg[row + 1][col + 1];
                }
                else{
                    int insert = strg[row + 1][col];
                    int delete = strg[row][col + 1];
                    int replace = strg[row + 1][col + 1];
                    strg[row][col] = Math.min(insert, Math.min(delete, replace)) + 1;
                }
            }
        }

        for(int i = 0;i < strg.length;i++){
            System.out.println(Arrays.toString(strg[i]));
        }

        return strg[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // System.out.println(EDRecursion1(s1, s2));

        // System.out.println(EDRecursion2(s1, s2, 0, 0));

          

        // int[][] strg = new int[s1.length()][s2.length()];

        // for(int i = 0;i < strg.length;i++){
        //     Arrays.fill(strg[i], -1);
        // }

        // System.out.println(EDtopDown(s1, s2, 0, 0, strg));

        System.out.println(EDbottomUP(s1, s2));
    }
}
