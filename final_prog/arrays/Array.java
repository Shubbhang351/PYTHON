import java.util.*;

class Array {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //int a[] = {10,52,30,90,80};
        // System.out.println(maximum(a));
        // System.out.println(find(a,80));

        int arr[] = {10,30,50,80,90};
        
        rotate(arr, 3);

        System.out.println(Arrays.toString(arr));

        int[] a = {10,30,52,80,90};
        System.out.println(Arrays.toString(a));

        updatedRotate(a, 3);

        System.out.println(Arrays.toString(a));

    }

    public static int maximum(int a[]){
        int maxi = a[0];
        for(int val : a){
            maxi = Math.max(maxi,val);
        }
        return maxi;
    }

    public static int find(int a[],int item){
        for(int i = 0;i < a.length;i++){
            if(a[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(int arr[], int item){
        int lo = 0;
        int hi = arr.length - 1;

        while(hi >= lo){
            int mid = (hi + lo) / 2; 

            if(arr[mid] == item)
                return mid;
            
            else if(item > arr[mid]){
                lo = mid + 1;
            }
            else{
                hi = mid - 1;
            }
        }
        return -1;
    }

    public static void reverse(int a[],int si, int ei){
        int i = si;
        int j = ei;

        while(j > i){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverse(int a[]){
        int i = 0;
        int j = a.length - 1;

        while(j > i){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotate(int a[], int rot){
        
        rot = rot % a.length;
        for(int r = 1;r <= rot;r++){
            int temp = a[a.length - 1];
        for(int j = a.length - 1;j >= 1;j--){
            a[j] = a[j - 1];
        }
        a[0] = temp;
        }
    }

    public static void updatedRotate(int a[], int rot){
        reverse(a,0,a.length - rot - 1);
        reverse(a,a.length - 1 - rot + 1, a.length - 1);
        reverse(a,0,a.length - 1);
    }
}
