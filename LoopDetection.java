import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

class Main{
    
    public static Node insertNode(Node head, int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return head;
        }
        
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
        
    }
    public static void display(Node head){
        Node temp = head;
        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print(temp.data+"->NULL");
    }
    public static void createCycle(Node head , int a  , int b){
        int cnta = 0;
        int cntb = 0;
        
        Node p1 = head;
        Node p2 = head;
        
        while(cnta!=a || cntb!=b){
            if(cnta!=a){
                p1 = p1.next;
                ++cnta;
            }
            if(cntb!=b){
                p2 = p2.next;
                ++cntb;
            }
        }
        p2.next = p1;
        
    }
    
    public static boolean detectCycle(Node head){
        
        if(head == null){
            return false;
        }
        
        Node fast = head;
        Node slow = head;
        
        while(fast.next.next!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Node head = null;
        
        for(int i = 0;i<n;i++){
            int m = sc.nextInt();
            head = insertNode(head , m);
        }
        
        display(head);
        
        int a = sc.nextInt();
        
        createCycle(head, 1, a);
        
        boolean found = detectCycle(head);
        if(found==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
