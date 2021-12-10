package linkedList;

import java.util.Scanner;

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
    public static LinkedList addElementInStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
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
    public static void deleteElementInStart() {
        LinkedList linkedList = addElementInStart();
        System.out.println("Before");
        linkedList.print();
        linkedList.pop();
        System.out.println("After");
        linkedList.print();
    }
    public static void deleteElementInLast() {
        LinkedList linkedList=addElementInStart();
        System.out.println("Before");
        linkedList.print();
        linkedList.remove();
        System.out.println("After");
        linkedList.print();
    }
    public static void searchTheElement() {
        LinkedList linkedList=addElementInStart();
        linkedList.print();
        System.out.println("Enter element you want to search");
        int a=(new Scanner(System.in)).nextInt();
        int position= linkedList.searchElement(a);
        System.out.println("Element present at "+position);
    }
    public static void insertTheElement() {
        LinkedList linkedList=addElementInStart();
        System.out.println("Before");
        linkedList.print();
        linkedList.insertAfter(30,40);
        System.out.println("After");
        linkedList.print();
    }
    public static void deleteNode() {
        LinkedList linkedList = addElementInStart();
        linkedList.print();
        System.out.println("Enter element you want to Delete");
        int a = (new Scanner(System.in)).nextInt();
        linkedList.deleteNode(a);
        linkedList.print();
    }
}
