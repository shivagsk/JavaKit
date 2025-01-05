package linkedlist;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
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

    public static void deleteMiddleEle(Node head) {
        if(head == null)
            return;
        Node slow = head, fast = head, prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("slow Next" + slow.next + " fast node " + fast);
        prev.next = slow.next;
        slow.next = null;
        printSingleLL(head);
    }

    public static void insertAtPosition(Node head,  int pos, int ele) {
        Node temp = new Node(ele); // 1->2->3->4->null
        int itr = 1;
        Node temp1 = head;
        while(itr<pos-1) {
            temp1 = temp1.next;
            itr+=1;
        }
        temp.next = temp1.next;
        temp1.next = temp;
        System.out.println("After Insertion");
        printSingleLL(head);
    }

    public static void removeKthEleFromLast(Node head, int k) {
        int len = lengthOfList(head, 0);
        int pos = len - k+1;
        int l =1;

        Node temp = head;
        while(l<pos-1) {
            temp = temp.next;
            l+=1;
        }
        Node kk = temp.next;
        temp.next = temp.next.next;
        kk.next = null;
        System.out.println("After Removing from last");
        printSingleLL(head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1, null);
        head.next = new Node(2, null);
        head.next.next = new Node(3, null);
        //head.next.next.next = new Node(4, null);

        Node l1 = new Node(11, null);
        l1.next = new Node(12, null);
        l1.next.next = new Node(13, null);

        int ele =15;
        insertAtPosition(l1, 2, ele);
        System.out.println();
        removeKthEleFromLast(l1, 4);

        printSingleLL(l1);
        System.out.println();


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
        System.out.println();
        Node node1 = new Node(1, null);
        node1.next = new Node(2, null);
        node1.next.next = new Node(3, null);
        node1.next.next.next = new Node(4, null);
        deleteMiddleEle(node1);

    }


}
