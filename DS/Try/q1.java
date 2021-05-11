class P{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,8};
        int b[] = {4,8,9,12,15};
        int c[] = {3,4,8,9,18,19,25};

        int j = a[0];
        int k = b[0];
        int l = c[0];

        for(int i = 0;i < a.length;i++){
            int ele = a[0];

            int f1 = 0;

            for(int o = 0;o < b.length;o++){
                if(ele == b[o]){
                    f1 = 1;
                    break;
                }
                if(ele < b[o]){
                    break;
                }
            }

            int f2 = 0;

            if(f1 == 1){
                for(int h = 0;h < c.length;h++){
                    if(ele == c[h]){
                        f2 = 1;
                        break;
                    }
                    if(ele < c[h]){
                        break;
                    }
                }
            }

            
        }


    }
}