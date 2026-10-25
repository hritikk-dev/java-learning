// Same package me ek class ko khi bhi use krr ske hai like ime node 

package DSA.LinkedList;

// class Node{
//     int val;
//     Node next;

//     Node(int val){
//         this.val = val;
//     }
// }
public class NodeOfList {

    public static void displayRecursion(Node head){

        if(head == null) return ;

        System.out.print(head.val + " ");
        displayRecursion(head.next);

    }

    // get value from particular index
    public static int get(Node head, int idx){
        int j = 0;
        int value = -1;
        Node temp = head;
        while(temp != null){
            if(j == idx){
                value = temp.val;
            }
            temp = temp.next;
            j++; 
        }

        return value;


        // this is indexing for LL
        // for(int i = 1; i<=idx; i++){
        //     head = head.next;
        // }

        // return head.val;
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // Establish connection between nodes

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        // displayRecursion(a);
        System.out.print("Value at idx is : " + get(a,2));    // get value at particular index

        // System.out.println(a.next.next.val);  // a->next(b)->next(c).val 

        
        Node temp = a;
        while(temp != null){
            System.out.println(a.val);
            temp = temp.next;
        }
    }
}
