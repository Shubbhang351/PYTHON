import java.util.Arrays;

class Recursion3{
    public static void main(String[] args) {
        // printArray(new int[]{2,3,6,4,5}, 0);
        // printArrayReverse(new int[]{2,3,6,4,5}, 0);
        // System.out.println(findMax(new int[]{10,5,80,60,20}, 0));
        // System.out.println(searchFirstOccurence(new int[]{10,20,30,40,30,50,40}, 300, 0));
        // System.out.println(searchLastOccurence(new int[]{10,20,30,40,30,50,40}, 40, 0));
        System.out.println(Arrays.toString(searchAllIndex(new int[]{10,20,30,40,30,30,100}, 30, 0, 0)));

    }

    public static void printArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }

        System.out.println(arr[i]);
        printArray(arr, i + 1);
    }

    public static void printArrayReverse(int[] arr, int i){
        if(i == arr.length){
            return;
        }

        printArrayReverse(arr, i + 1);
        System.out.println(arr[i]);
    }

    public static int findMax(int[] arr, int i){
        if(i == arr.length){
            return Integer.MIN_VALUE;
        }

        return Math.max(arr[i], findMax(arr, i + 1));
    }

    public static int searchFirstOccurence(int arr[], int item, int i){
        if(i == arr.length){
            return -1;
        }

        if(item == arr[i]){
            return i;
        }
        return searchFirstOccurence(arr, item, i + 1);
    }

    public static int searchLastOccurence(int arr[], int item, int i){
        if(i == arr.length){
            return -1;
        }

        int sp = searchLastOccurence(arr, item, i + 1);
        
        if(arr[i] == item && sp == -1){
            return i;
        }
        return sp;
    }

    public static int[] searchAllIndex(int arr[], int item,int i,int count){
        if(i == arr.length){
            return new int[count];
        }

        int ans[];
        if(item == arr[i]){
            ans = searchAllIndex(arr, item, i + 1, count + 1);
            ans[count] = i;
        }
        else{
            ans = searchAllIndex(arr, item, i + 1, count);
        }
        return ans;
    }
}