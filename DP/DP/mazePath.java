package DP;
import java.util.*;

class MazePath{
    public static int MPRecursion(int cr, int cc, int er, int ec){
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > ec ||  cc > ec){
            return 0;
        }

        int ch = MPRecursion(cr, cc + 1, er, ec);

        int cv = MPRecursion(cr + 1, cc, er,ec);

        return ch + cv;
    }

    public static int MPTD(int cr, int cc, int er, int ec, int[][] strg){
        if(cr == er && cc == ec){
            return 1;
        }

        if(cr > ec ||  cc > ec){
            return 0;
        }

        if(strg[cr][cc] != 0){
            return strg[cr][cc];
        }

        int ch = MPTD(cr, cc + 1, er, ec, strg);

        int cv = MPTD(cr + 1, cc, er,ec, strg);

        strg[cr][cc] = ch + cv;

        return ch + cv;
    }
    // bottom up
    public static int MPBU(int er, int ec){
        int[][] strg = new int[er + 2][ec + 2];

        

        for(int row = er; row >= 0; row-- ){
            for(int col = ec; col >= 0;col--){

                if(row == er && col == ec){
                    strg[row][col] = 1;
                }
                else{
                    strg[row][col] = strg[row + 1][col] + strg[row][col + 1];
                }
            }
        }

        return strg[0][0];
    }

    // space efficient bottom up
    public static int MPBU_space_effi(int er, int ec){
        int strg[] = new int[ec + 1];

        Arrays.fill(strg, 1);

        for(int row = er - 1;row >= 0; row--){
            //System.out.println(Arrays.toString(strg));
            for(int col = ec;col >= 0;col--){
                if(col == ec){
                    continue;
                }
                strg[col] = strg[col] + strg[col + 1];
            }
        }

        

        return strg[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int er = sc.nextInt();
        int ec = sc.nextInt();
        //System.out.println(MPRecursion(0, 0, n, n));
        //System.out.println(MPTD(0, 0, n, n, new int[n + 1][n + 1]));

        System.out.println(MPBU_space_effi(er, ec));
    }
}