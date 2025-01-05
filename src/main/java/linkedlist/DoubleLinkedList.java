package linkedlist;

class DNode {
    int data;
    DNode left, right;

    DNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class DoubleLinkedList {

    public static void printDoubleLL(DNode head) {
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.right;
        }
    }
    public static void main(String[] args) {
        DNode head = new DNode(10);
        head.right = new DNode(20);
        head.left = new DNode(5);
        head.right.right = new DNode(25);
        // 5 -> 10 -> 20 ->25
        printDoubleLL(head);
    }
}
