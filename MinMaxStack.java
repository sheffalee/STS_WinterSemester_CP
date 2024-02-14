import java.util.*;

class MyStack{
    Stack<Integer> s;
    Stack<Integer> a;
    
    MyStack(){
        s = new Stack<Integer>();
        a = new Stack<Integer>();
        
    }
    int getMin(){
        
        if(a.isEmpty()){
            System.out.println("Stack is empty");
            // return;
        }
        // else{
        //     System.out.println("Minimum element is "+a.peek());
        // }
        return a.peek();
    }
    
   int getMax(){
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            // return ;
         }
        // else{
            
        //     System.out.println("Maximum element is "+s.peek());
        // }
        return s.peek();
    }
    
    void peek(){
        
        if(s.isEmpty()){
            System.out.println("Stack is empty");
            return ;
            }
        else{
            int t = s.peek();
            System.out.println("Top element is : "+t);
            
        }
        
    }
    void pop(){
        int t = s.pop();
        if(s.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Removed element is : "+t);
            if(t==a.peek()){
                a.pop();
            }
        }
    }
    void push(int data){
        //empty
        
        if(s.isEmpty()){
            a.push(data);
            s.push(data);
            System.out.println("Data inserted is : "+data);
            return ;
        }
        
        //not empty
        
        else{
            
            s.push(data);
            System.out.println("Data inserted is : "+data);
            if(data<= a.peek()){
                a.push(data);
            }
        }
    }
};


class Main{
    
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        MyStack s = new MyStack();
        
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            int m = sc.nextInt();
            s.push(m);
        }
        // s.getMin();
        // s.getMax();
        System.out.println("Minimum Element is "+s.getMin());
        System.out.println("Maximum element is "+s.getMax());
    }
}
