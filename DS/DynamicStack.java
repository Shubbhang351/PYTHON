package stack;

import java.util.Arrays;

public class DynamicStack extends Stack {

    public DynamicStack(int size){
        super(size);
    }
    
    @Override
    public void push(int item)throws Exception{
        if(isFull()){
            int n[] = new int[2 * data.length];

            for(int i = 0;i < data.length;i++){
                n[i] = data[i];
            }

            data = n;
        }
        super.push(item);
    }
}
 