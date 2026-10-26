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
        // when LL contains only one node 
        if(head == tail) {
            head = null;
            tail = null;
            size--;
            return ;
        }
        
        // when LL has no any node
        if(head == null) return;
        
        // when LL contains some elements 
        head = head.next;
        size--;
        
    }

    // delete node using element
    void deleteEle(int ele){
        if(head == null) {
            System.out.println("List is empty");
            return;
        }   
       
        if(head.val == ele){
            head = head.next;
            size--;

            if(head == null){
                tail = null;
            }   
            return;
            // deleteAtHead();
        }   
        
        Node temp = head;
        while (temp.next != null && temp.next.val != ele) {
            temp= temp.next;
        }

        if(temp.next == null){
            System.out.println("element not found");
            return ;
        }
        
        if(temp.next == tail){
            tail = temp;
            temp.next = temp.next.next;
            size--;
            return ;
        }
        
        if(temp.next.val == ele){
            temp.next = temp.next.next;
            size--;
            return ;   
        }

    }

    // delete element at any index
    void deleteAtIdx(int idx){

        if(idx == 0 && head == null) return; // LL is empty
        if(idx < 0 || idx >= size) {System.out.println("Invalid index");
            return ;
        }
        if(idx == 0){
            head = head.next;
            size--;
            return ;
        }
        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;

        
    }
    
    // insert at any index
    void insert(int idx, int val){
        if(idx < 0){
            System.out.println("Invalid index");;
            return;
        }

        if(idx > size ) {
            System.out.println("Can't insert value on idx");    
            return;
        }

        if(idx == 0 && head != null){
            Node temp = new Node(val);
            temp.next = head;
            head = temp; 
            size++;
            return;
        }
        if(head == null && idx == 0){
            Node temp = new Node(val);
            head = temp;
            tail = temp;
            size++;
            return;
        }
        
        if(idx == size){
            Node temp = new Node(val);
            tail.next = temp;
            tail = temp;
            size++;
            return;
        }

        int i = 0;
        Node temp = head; 
        while(i < idx-1){
            i++;
            temp = temp.next;
        }

        Node nextNode = temp.next;
        Node NewNode = new Node(val);
        temp.next = NewNode;
        NewNode.next = nextNode;
        size++;

    }

    //Search the element in linkedList
    boolean searchEle(int ele){
        for(Node temp = head; temp!=null; temp=temp.next){
            if(temp.val == ele){
                return true;
            }
        }
        return false;
    }

    // get element from index
    int getEle(int idx){
        if(idx < 0 || idx >= size) {
            // System.out.println("invalid index");
            return -1;
        }
        if(head == null){
            return -1;
        }

        Node temp = head;
        for(int i = 0 ; i < idx ; i++){
            temp = temp.next;
        }
        return temp.val;
        
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
        ll.deleteAtHead();
        ll.display();

        System.out.println(ll.size);

        ll.insert(1,100);
        ll.insert(-4,100);
        ll.display();
        System.out.println(ll.size);
        ll.insert(8, 200);
        ll.display();
        System.out.println(ll.size);

        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.searchEle(150));

        ll.display();
        System.out.println(ll.size);
        ll.deleteAtIdx(2);
        ll.display();
        System.out.println(ll.size);
        ll.display();

        
        int ele = ll.getEle(8);
        if(ele < 0){
            System.out.println("Wrong input");
        }else{
            System.out.println(ele);
        }
    }
}