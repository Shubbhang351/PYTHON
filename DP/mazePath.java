package DP;
import java.util.*;

public class MazePath{
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
}