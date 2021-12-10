package linkedList;

public class LinkedList {
    Node head;
    Node tail;

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = this.head;
            this.head=newNode;
            newNode.next= temp;
        }
    }
    public void print(){
        Node temp = head;
        if (head == null){
            System.out.println("Linked list is empty");
        }else {
            while (temp != null){
                if (temp.next != null) {
                    System.out.print(temp.data + "->");
                }else {
                    System.out.println(temp.data);
                }
                temp =temp.next;
            }
        }
    }
    public void appendData(int data) {
        Node node=new Node(data);
        if(head==null){
            this.head=node;
        }
        else {
            tail.next=node;
        }
        this.tail=node;
    }
    public void addInMid(int data) {
        Node newNode= new Node(data);
        Node current = null, temp;
        if (head==null){
            head= newNode;
            tail=newNode;
        }
        else {
            int size = size();
            int center = (size % 2==0) ? size/ 2 : (size+1) /2;
            temp=head;
            for(int i = 0;i < center; i++){
                current = temp;
                temp = temp.next;
            }
            current.next = newNode;
            newNode.next = temp;
        }
    }
    public int size(){
        int length = 0;
        Node temp = head;
        while (temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }
    public void pop() {
        this.head = this.head.next;
    }
    public void remove() {
        Node newNode = this.head;
        while (newNode.next != null) {
            newNode = newNode.next;
            newNode.next = null;
        }
    }
}
