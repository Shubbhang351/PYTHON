import stack.*;

public class Sclient {
    
    public static void main(String[] args) throws Exception {
        DynamicStack s = new DynamicStack(2);
        s.push(1);
        s.push(2);
        s.push(3);

        DynamicStack helper = new DynamicStack(2);

        System.out.println(s);
        System.out.println("after reverse");
        actualReverse(s, helper);
        System.out.println(s);


        
    }

    public static void reverseStack(Stack s)throws Exception{
        if(s.isEmpty()){
            return;
        }
        int temp = s.pop();
        reverseStack(s);
        System.out.print(temp + " ");
        s.push(temp);
    }

    public static void actualReverse(DynamicStack s, DynamicStack helper)throws Exception{
        if(s.isEmpty()){
            
            done(s,helper);
            return;
        }
        int temp = s.pop();
        helper.push(temp);
        actualReverse(s, helper);
    }

    public static void done(DynamicStack s, DynamicStack helper)throws Exception{
        if(helper.isEmpty()){
            return;
        }
        int temp = helper.pop();
        done(s, helper);
        s.push(temp);
       
    }


}
