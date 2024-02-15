import java.util.*;

class Main{
    
    public static int solve(int[][] arr){
        Stack<Integer> s= new Stack<>();
        
        for(int i =0;i<arr.length;i++){
            s.push(i);
        }
        
        while(s.size()>1){
            
            int col = s.pop();
            int row = s.pop();
            
            if(arr[row][col]==1){
                s.push(col);
            }
            else{
                s.push(row);
            }
            
        }
        
        int x = s.pop();
        
        for(int j =0;j<arr.length;j++){
            
            if(j==x){
                continue;
            }
            
            if(arr[x][j]==1){
                return -1;
            }
        }
        
        for(int i = 0;i<arr.length;i++){
            
            if(i==x)
                continue;
            
            if(arr[i][x]==0){
                return -1;
            }
        }
        
        return x;
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[][] arr  = new int[n][n];
        
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        
        int ans = solve(arr);
        
        if(ans==-1){
            System.out.println("Not present");
        }
        else{
            System.out.println("Present");
        }
    }
}
