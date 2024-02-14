import java.util.*;

class Node{
    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class Main{
    public static Node insertNode(Node head, int data){
        Node newNode = new Node(data);
        if(head== null){
            head = newNode;
            return head;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next= newNode;
        return head;
        
    }
    public static void display(Node head){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"<->");
            temp= temp.next;
        }
        System.out.print(temp.data);
    }
    
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        int[] arr= new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            if(arr[i]%2==0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<even.size();i++){
            res.add(even.get(i));
        }
        for(int  i = 0;i<odd.size();i++){
            res.add(odd.get(i));
        }
        
        for(int i = 0;i<res.size();i++){
            head = insertNode(head , res.get(i));
        }
        
        display(head);
        
    }
}
