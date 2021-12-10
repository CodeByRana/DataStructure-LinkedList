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
}
