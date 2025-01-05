package linkedlist;

class Node1 {
    int data;
    Node1 next;
    Node1(int data, Node1 next) {
        this.data = data;
        this.next = next;
    }
    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SingleLinkedList {

    public static void printList(Node1 head) {
        while(head!=null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    public static void middleOfList(Node1 head) {
        Node1 slow = head, fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println( "Middle Element of List : " + slow.data);

    }

    public static void reverseList(Node1 head) {
        Node1 curr = head, next;
        // 1->2->3->null
        // 3->2->1->null
        Node1 prev = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        printList(prev);
    }
    public static void main(String[] args) {
        Node1 head = new Node1(10, null);
        head.next = new Node1(15);
        head.next.next = new Node1(20);
        head.next.next.next = new Node1(25);

        printList(head);
        System.out.println();
        middleOfList(head);
        reverseList(head);
    }
}
