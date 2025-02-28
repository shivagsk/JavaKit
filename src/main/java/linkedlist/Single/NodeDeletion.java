package linkedlist.Single;

public class NodeDeletion {
    public static void printList(SinglyLinkedListNode head) {
        while(head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println();
    }
    public static SinglyLinkedListNode listCreation(int n) {
        SinglyLinkedListNode head = null, temp = null;
        for(int i=1; i<=n; i++) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(i*2);
            if(temp == null) {
                temp = node;
                head = temp;
            } else {
                temp.next = node;
                temp = temp.next;
            }
        }
        return head;
    }
    public static SinglyLinkedListNode deletionAtBeginning(SinglyLinkedListNode head) {
        if(head == null)
            return null;
        SinglyLinkedListNode temp = head;
        head = head.next;
        temp.next = null;
        return head;
    }
    public static SinglyLinkedListNode deletionAtPosition(SinglyLinkedListNode head, int position) {
        if(head == null) {
            return null;
        }
        SinglyLinkedListNode temp = head, lastButOne = null;
        for(int i=1; i<position && (temp != null && temp.next != null); i++) {
            lastButOne = temp;
            temp = temp.next;
        }
        if(temp.next == null)
            return head;
        lastButOne.next = temp.next;
        temp = null;
        return head;
    }
    public static SinglyLinkedListNode deletionAtEnd(SinglyLinkedListNode head) {
        if(head == null)
            return head;
        SinglyLinkedListNode temp = head, lastButOne = null;
        while(temp != null && temp.next != null) {
            lastButOne = temp;
            temp = temp.next;
        }
        temp = null;
        lastButOne.next = temp;
        return head;
    }
    public static void main(String[] args) {
        SinglyLinkedListNode head = listCreation(5);
        printList(head);
        head = deletionAtBeginning(head);
        printList(head);
        head = deletionAtEnd(head);
        printList(head);
        head = deletionAtPosition(head, 4);
        printList(head);
    }
}
