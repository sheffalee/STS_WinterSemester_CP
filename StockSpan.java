import java.util.*;

class Main{
    
    public static void solve(int[] arr , int n , int[] s){
        
        Stack<Integer> st = new Stack<>();
        
        st.push(0);
        s[0] = 1;
        
        for(int i = 1;i<n;i++){
            
            while(!st.isEmpty() && arr[st.peek()]<= arr[i]){
                st.pop();
            }
            
            s[i] = (st.isEmpty()) ? (i+1):(i-st.peek());
            st.push(i);
        }
    }
    
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int s[] = new int[n];
        
        solve(arr, n , s);
        
        printArray(s);
    }
}
