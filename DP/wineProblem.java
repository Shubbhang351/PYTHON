import java.util.*;

class wineProblem {
    
    public static int WPRecursion(int[] prices, int year, int start, int end){
        if(start == end){
            return year * prices[start];
        }


        int left_wine = (prices[start] * year) + WPRecursion(prices, year + 1, start + 1, end);

        int righ_wine = (prices[end] * year) + WPRecursion(prices, year + 1, start, end - 1);

        return Math.max(left_wine, righ_wine);
    }

    public static int WPTD(int[] prices, int year, int start, int end, int[][] strg){
        if(start == end){
            // strg[start][end] = year * prices[start];
            return year * prices[start];
        }

        if(strg[start][end] != -1){
            return strg[start][end];
        }


        int left_wine = (prices[start] * year) + WPTD(prices, year + 1, start + 1, end, strg);

        int righ_wine = (prices[end] * year) + WPTD(prices, year + 1, start, end - 1, strg);

        strg[start][end] = Math.max(left_wine, righ_wine);

        return Math.max(left_wine, righ_wine);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[] prices = {2,3,5,1,4,5,14,16,2,0,3,5,8,5,9,88,100,3,6,12,11,19,20,59,49,89,79,55,45,56,58,52,11,111,123,100,156,1588,165,14};
        //System.out.println(WPRecursion(prices, 1, 0, prices.length - 1));

        int prices[] = {2,3,5,1,4};

        int strg[][] = new int[prices.length][prices.length];

        for(int i = 0;i < strg.length;i++){
            Arrays.fill(strg[i], -1);
        }

        System.out.println(WPTD(prices, 1, 0, prices.length - 1, strg));
    }
}
