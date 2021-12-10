package linkedList;

public class Operation {
    public static void createSimpleLikedList() {
        Node firstNode = new Node(56);
        Node secondNode = new Node(30);
        Node thirdNode = new Node(70);
        firstNode .next = secondNode;
        secondNode.next = thirdNode;
        Node head = firstNode;
        Node tail = thirdNode;

        Node temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
    public static void addElementInStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
    }
    public static void addElementAtEnd() {
        LinkedList linkedList =new LinkedList();
        linkedList.appendData(56);
        linkedList.appendData(30);
        linkedList.appendData(70);
        linkedList.print();
    }
    public static void addElementInMid() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(56);
        linkedList.addInMid(30);
        linkedList.print();
    }
}
