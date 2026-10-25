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

    // method to add element at tail 
    void addAtTail(int ele){
        Node temp = new Node(ele);
        
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

    // Method to display the ele
    void display(){

        // when linked List is empty
        if(head == null) return;

        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
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

    }
}
