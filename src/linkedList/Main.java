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
            default:
                System.out.println("please enter correct option");
        }
    }
}
