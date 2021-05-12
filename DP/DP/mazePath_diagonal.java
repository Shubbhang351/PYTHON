package DP;

import java.util.*;

class mazePath_diagonal {
    public static int MPRecursion(int cr, int cc, int er, int ec){
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > er || cc > ec){
            return 0;
        }

        int ch = MPRecursion(cr, cc + 1, er, ec);

        int cv = MPRecursion(cr + 1, cc, er, ec);

        int cd = MPRecursion(cr + 1, cc + 1, er, ec);

        return ch + cv + cd;
    }


    // top down DP
    public static int MPTD(int cr, int cc, int er, int ec, int[][] strg){
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > er || cc > ec){
            return 0;
        }

        if(strg[cr][cc] != 0){
            return strg[cr][cc];
        }

        int ch = MPTD(cr, cc + 1, er, ec, strg);

        int cv = MPTD(cr + 1, cc, er, ec, strg);

        int cd = MPTD(cr + 1, cc + 1, er, ec, strg);

        strg[cr][cc] = ch + cv + cd;

        return ch + cv + cd;
    }

    // DP :- bottom up
    public static int MPBU(int er, int ec){
        int strg[][] = new int[er + 1][ec + 1];

        Arrays.fill(strg[er], 1);

        for(int row = 0;row <= er;row++){
            strg[row][ec] = 1;
        }

        for(int row = er - 1;row >= 0;row--){
            for(int col = ec;col >= 0;col--){
                if(col == ec){
                    continue;
                }
                strg[row][col] = strg[row + 1][col] + strg[row][col + 1] + strg[row + 1][col + 1];
            }
        }


        return strg[0][0];
    }

    // DP :- bottom up sace effi
    public static int MP_space_effi(int er, int ec){
        int strg[] = new int[ec + 1];

        Arrays.fill(strg, 1);

        for(int row = 0; row < er;row++){
            int prev = strg[ec];
            for(int col = ec; col >= 0;col--){
                if(col == ec){
                    continue;
                }
                int temp = strg[col] + strg[col + 1] + prev;
                prev = strg[col];
                strg[col] = temp;
            }
        }

        // System.out.println(Arrays.toString(strg));

        return strg[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int er = sc.nextInt();
        int ec = sc.nextInt();
        //System.out.println(MPRecursion(0, 0, er, ec));
        //System.out.println(MPTD(0, 0, er, ec, new int[er + 1][ec + 1]));
        //System.out.println(MPBU(er, ec));
        System.out.println(MP_space_effi(er, ec));
    }
}
