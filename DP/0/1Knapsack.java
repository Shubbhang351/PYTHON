import java.util.*;

class Knapsack {
    
    public static int knapsackRecursion(int[] weight, int[] price, int i, int capacity){
        if(i == weight.length || capacity == 0){
            return 0;
        }


        // exclude
        int exclude = knapsackRecursion(weight, price, i + 1, capacity);

        //include
        int include = 0;
        if(capacity >= weight[i])
            include = price[i] + knapsackRecursion(weight, price, i + 1, capacity - weight[i]);

        int ans = Math.max(exclude, include);

        return ans;
    }

    public static void main(String[] args) {
        int weight[] = {1,3,4,5};

        int price[] = {1,4,5,7};

        int capacity = 7;

        System.out.println(knapsackRecursion(weight, price, 0, capacity));
    }
}
