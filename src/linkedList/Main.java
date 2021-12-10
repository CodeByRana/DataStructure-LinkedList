package linkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList Data Structure : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to create a simple linked list : ");
        System.out.println("Enter 2 add element in start linked list : ");
        System.out.println("Enter 3 add element in end : ");
        System.out.println("Enter 4 to add element in middle : ");
        System.out.println("Enter 5 to delete the first element : ");
        System.out.println("Enter 6 to delete element from last : ");
        System.out.println("Enter 7 to search the element : ");
        System.out.println("Enter 8 to add the element in linked list : ");
        System.out.println("Enter 9 to delete the element in linked list : ");
        switch (sc.nextInt()){
            case 1:
                Operation.createSimpleLikedList();
                break;
            case 2:
                Operation.addElementInStart();
                break;
            case 3:
                Operation.addElementAtEnd();
                break;
            case 4:
                Operation.addElementInMid();
                break;
            case 5:
                Operation.deleteElementInStart();
                break;
            case 6:
                Operation.deleteElementInLast();
                break;
            case 7:
                Operation.searchTheElement();
                break;
            case 8:
                Operation.insertTheElement();
                break;
            case 9:
                Operation.deleteNode();
                break;
            default:
                System.out.println("please enter correct option");
        }
    }
}
