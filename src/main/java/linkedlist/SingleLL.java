package linkedlist;

class Node {
    int data;
    Node next;
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
public class SingleLL {

    public static int lengthOfList(Node temp, int len) {
        if(temp == null)
            return len;
        return lengthOfList(temp.next, len+1);
    }
    public static void printSingleLL(Node head) {
        while(head!=null) {
            System.out.print(head.data + " -> ");
            head=head.next;
        }
    }
    public static void printMiddleEleUsingCount(Node list) {
        Node temp = list;
        int n = lengthOfList(list, 0);
        int ind = 0;
        while(ind<n/2) {
            temp = temp.next;
            ind+=1;
        }
        System.out.println("Middle Element : " + temp.data);
    }
    public static void printMiddleEleUsingHareAndTortoise(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println("Hare & Tortoise mid Ele:: " + slow.data);
    }

    public static void printReverseList(Node head) {
        Node prev = null, curr = head, next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        printSingleLL(prev);
    }

    public static void rotateByK(Node head, int k) {
        if(head == null)
            return ;
        Node res = head;
        int ind = 1;
        while(ind < k) {
            ind +=1;
            head = head.next; // 1->2->3->4->null
        }

        Node temp = head.next;
        head.next = null;
        temp.next = res;

        printSingleLL(temp);
    }
    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        head.next.next.next = new Node(4, null);

        printSingleLL(head);
        System.out.println();
        printMiddleEleUsingCount(head);
        System.out.println();
        printMiddleEleUsingHareAndTortoise(head);
        System.out.println();
        printReverseList(head);
        System.out.println();
        Node node = new Node(1, null);
        node.next = new Node(2, null);
        node.next.next = new Node(3, null);
        node.next.next.next = new Node(4, null);
        rotateByK(node, 3);
    }
}
