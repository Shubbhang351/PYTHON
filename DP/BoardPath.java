package DP;

import java.util.*;

public class BoardPath {

    public static int BPRecursion(int curr, int end) {
        if (curr == end) {
            return 1;
        }

        if(curr > end){
            return 0;
        }

        int ans = 0;

        for (int dice = 1; dice <= 6; dice++) {
            ans += BPRecursion(curr + dice, end);
        }
        return ans;
    }

    public static int BPTD(int curr, int end, int[] strg) {
        if (curr == end) {
            return 1;
        }

        if(curr > end){
            return 0;
        }

        if(strg[curr] != 0){
            return strg[curr];  // re_use
        }

        int ans = 0;

        for (int dice = 1; dice <= 6; dice++) {
            ans += BPTD(curr + dice, end, strg);
        }
        strg[curr] = ans; // strore
        return ans;
    }

    public static int BoardPathBU(int end){
        int strg[] = new int[end + 6];
        strg[end] = 1;

        for(int curr = end - 1;curr >= 0;curr--){
            int temp = 0;
            for(int dice = 1;dice <= 6;dice++){
                temp = temp + strg[curr + dice];
            }
            strg[curr] = temp;
        }

        return strg[0];
    }

    // DP bottom up space efficient
    public static int BoardPathBU2(int end){
        int strg[] = new int[6];
        strg[0] = 1;

        for(int i = 0;i < end;i++){
            int sum = 0;
            for(int j = 0;j < 6;j++){
                sum = sum + strg[j];
            }

            // shifting
            for(int j = 5;j > 0;j--){
                strg[j] = strg[j - 1];
            }
            strg[0] = sum;
        }

        return strg[0];
    }

    public static void main(String[] args) {
        int n = 100000;
        //System.out.println(BPRecursion(0, 40));
        //System.out.println(BPTD(0, n, new int[n]));

        System.out.println(BoardPathBU2(n));
    }
}
