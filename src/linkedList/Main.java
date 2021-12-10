package linkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To LinkedList Data Structure");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to create a simple linked list");
        switch (sc.nextInt()){
            case 1:
                Operation.createSimpleLikedList();
                break;
            default:
        }
    }
}
