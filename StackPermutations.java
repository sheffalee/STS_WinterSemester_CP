import java.util.*;

class Main{
    
    public static boolean check(int[] a , int[] b , int n){
        
        Stack<Integer> s = new Stack<Integer>();
        
        int j = 0;
        
        for(int i = 0;i<n;i++){
            s.push(a[i]);
            
            while(!s.isEmpty() && s.peek()== b[j]){
                
                s.pop();
                j++;
            }
        }
        
        
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int a[] = new int[n];
        
        int b[] = new int[n];
        
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        for(int i = 0;i<n;i++){
            b[i] = sc.nextInt();
        }
        
        boolean ans = check(a, b, n);
        
        if(ans== true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
