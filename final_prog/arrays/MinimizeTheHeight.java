import java.util.*;

class MinimizeTheHeight {
    
    public static int getMinDiff(int a[], int k, int n){
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

        int min,max,diff;

        diff = Integer.MAX_VALUE;

        int d1 = Integer.MAX_VALUE;
        if(a[0] - k >= 0 && (a[n - 1] + k) - (a[0] - k) > 0){
            d1 = (a[n - 1] + k) - (a[0] - k);
        }
        int d2 = Integer.MAX_VALUE;
        if(a[n - 1] - k >= 0 && (a[n - 1] - k) - (a[0] + k) > 0){
            d2 = (a[n - 1] - k) - (a[0] + k);
        }

        int d3 = a[n - 1] - a[0];

        if(d1 < d2){
            min = a[0] - k;
            max = a[n - 1] + k;
            diff = d1;
        }
        else if(d2 < d1){
            min = a[0] + k;
            max = a[n - 1] - k;
            diff = d2;
        }
        else{
            if(d2 < d3){
                min = a[0] + k;
                max = a[n - 1] - k;
                diff = d2;
            }
            else if(d1 < d3){
                min = a[0] - k;
                max = a[n - 1] + k;
                diff = d1;
            }
            else{
                if(a[0] - k >= 0){
                    min = a[0] - k;
                    max = a[n - 1] - k;
                    diff = d3;
                }
                else{
                    min = a[0] + k;
                    max = a[n - 1] + k;
                    diff = d3;
                }
                
            }
            
        }

        

        System.out.println(min + " " + max + " " + diff);

        for(int i = n - 2; i >= 1;i--){
            // a[i] may be min
            if(a[i] - k >= 0 && a[i] - k < min){
                int tdiff = max - (a[i] - k);
                if(tdiff < diff){
                    min = a[i] - k;
                    diff = tdiff;
                }
            }
            else if(a[i] + k < min){
                int tdiff = max - (a[i] + k);
                if(tdiff < diff){
                    min = a[i] + k;
                    diff = tdiff;
                }
            }
            else if(a[i] - k >= 0 && a[i] - k > max){
                int tdiff = (a[i] - k) - min;
                if(diff > tdiff){
                    max = a[i] - k;
                    diff = tdiff;
                }
            }
            else if(a[i] + k > max){
                int tdiff = (a[i] + k) - min;
                if(tdiff < diff){
                    max = a[i] + k;
                    diff = tdiff;
                }
            }
            
        }

        return diff;
    }

    public static void main(String[] args) {
        int a[] = {2,6,3,4,7,2,10,3,2,1};
        int k = 5;

        System.out.println(getMinDiff(a, k, a.length));
    }
}
