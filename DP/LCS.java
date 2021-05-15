import java.util.Arrays;
import java.util.Scanner;

class LCS {
    
    public static int LCSREcursion(String s1, String s2, int i, int j){
        if(i == s1.length() || j == s2.length()){
            return 0;
        }

        if(s1.charAt(i) == s2.charAt(j)){
            return 1 + LCSREcursion(s1, s2, i + 1, j + 1);
        }
        else{
            int a = LCSREcursion(s1, s2, i, j + 1);

            int b = LCSREcursion(s1, s2, i + 1, j);

            return Math.max(a, b);
        }
    }

    // DP top down
    public static int LCStd(String s1, String s2, int i, int j, int[][] strg){
        if(i == s1.length() || j == s2.length()){
            return 0;
        }

        if(strg[i][j] != -1 ){
            return strg[i][j];
        }

        int ans = 0;

        if(s1.charAt(i) == s2.charAt(j)){
            ans =  1 + LCStd(s1, s2, i + 1, j + 1, strg);
        }
        else{
            int a = LCStd(s1, s2, i, j + 1, strg);

            int b = LCStd(s1, s2, i + 1, j, strg);

            ans =  Math.max(a, b);
        } 

        strg[i][j] = ans;

        return ans;
    }

    // bottom up 
    public static int LCSBU(String s1,String s2){
        int strg[][] = new int[s1.length() + 1][s2.length() + 1];



        //strg[s1.length() - 1][s2.length() - 1] = s1.charAt(s1.length() - 1) == s2.charAt(s2.length() - 1) ? 1 : 0; 

        for(int row = s1.length() - 1; row >= 0;row--){
            for(int col = s2.length() - 1;col >= 0;col--){
                if(s1.charAt(row) == s2.charAt(col)){
                    strg[row][col] = 1 + strg[row + 1][col + 1];
                }
                else{
                    strg[row][col] = Math.max(strg[row + 1][col], strg[row][col + 1]);
                }
            }
        }

        // for(int i = 0;i < strg.length;i++){
        //     System.out.println(Arrays.toString(strg[i]));
        // }

        return strg[0][0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s1 + " " + s2);

        //System.out.println(LCSREcursion(s1, s2, 0, 0));

        // int[][] strg = new int[s1.length()][s2.length()];

        // for(int i = 0;i < strg.length;i++){
        //     Arrays.fill(strg[i], -1);
        // }

        // System.out.println(LCStd(s1, s2, 0, 0, strg));

        // bu
        System.out.println(LCSBU(s1, s2));
    }
}
 