import java.util.*;

class Array11 {
    public static int doUnion(int a[], int n, int b[], int m){
        int i = 0;
        int j = 0;
        //int ans[] = new int[n + m];
        

        Arrays.sort(a);
        Arrays.sort(b);

        while(i < a.length && j < b.length){

            if(a[i] < b[j]){
                if(a[i] != a[i - 1])
                    System.out.print(a[i] + " ");
            
                i++;
            }
            else if(a[i] > b[j]){
                if(b[j] != b[j - 1])
                    System.out.print(b[j] + " ");
                j++;
            }
            else{
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }

        while(i < a.length){
            System.out.print(a[i++] + " ");
        }

        while(j < b.length){
            System.out.print(b[j++] + " ");
        }

        return i;
    }

    public static void main(String[] args) {
        PriorityQueue todo = new PriorityQueue();
        todo.add("dishes");
        todo.add("laundry");
        todo.add("bills");
        todo.offer("bills");
        System.out.println(todo.size() + " " + todo.poll());
        System.out.println(todo.peek() + " " + todo.poll());
        System.out.println(todo.poll() + " " + todo.poll());
    }
}
