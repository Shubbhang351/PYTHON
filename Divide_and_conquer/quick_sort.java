package Divide_and_conquer;

import java.util.Arrays;

class Quick_sort {
    public static void quickSort(int arr[], int lo, int hi) {

        if(lo >= hi){
            return;
        }

        int mid = (lo + hi) / 2;

        int pivot = arr[mid];

        int left = lo;
        int right = hi;

        while (left <= right) {

            // left problem point
            while (arr[left] < pivot) {
                left++;
            }

            // right problem point
            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

        quickSort(arr, lo, right);
        quickSort(arr, left, hi);
    }

    public static void main(String[] args) {
        int arr[] = {80,10,50,30,60,20,70,25};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
