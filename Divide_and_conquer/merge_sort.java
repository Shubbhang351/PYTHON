package Divide_and_conquer;

class Merge_sort {
    public static int[] mergeSort(int arr[], int lo, int hi){

        int mid = (lo + hi) / 2;

        int[] fh = imergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
    }

    public static void
}
