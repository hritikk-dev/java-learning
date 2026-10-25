package DSA.LinkedList;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

// create a linkedList data structure
class LinkedList{
    Node head;
    Node tail;
    int size;    // This store the size of array

    // method to add element at tail 
    void addAtTail(int ele){
        Node temp = new Node(ele);
        size++;
        
        // when LinkedList is empty there head and tail point to only one node that is temp
        if(tail == null){

            head = temp;
            tail = temp;

        }
        // if LinkedList contains some value than create a new node and connect with tail and move tail to temp
        else{
            tail.next = temp;
            tail = temp;
        }
    }

    // method to add element at head
    void addAtHead(int ele){
        Node temp = new Node(ele);
        size++;

        // when LL is empty
        if(head == null){
            head = temp;
            tail = temp;
        }

        // when LL contains some values
        else{
            temp.next = head;
            head = temp;
        }
    }

    // delete node from head
    void deleteAtHead(){
        size--;
        // when LL contains only one node 
        if(head == tail) {
            head = null;
            tail = null;
            return ;
        }

        // when LL contain not any node
        if(head == null) return;

        // when LL contains some elements 
        head = head.next;
    }


    // Method to display the LinkedList
    void display(){

        // when linked List is empty
        if(head == null) return;

        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class LinkedListDataStructure {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtTail(60);

        ll.display();
        System.out.println(ll.size);
        
        
        ll.addAtHead(70);
        ll.addAtHead(80);
        ll.addAtHead(90);
        ll.display(); 
        
        System.out.println(ll.size);
        
        ll.deleteAtHead();
        ll.display();

        System.out.println(ll.size);

    }
}
