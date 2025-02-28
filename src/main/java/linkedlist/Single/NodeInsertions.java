package linkedlist.Single;

public class NodeInsertions {
    public static void printList(SinglyLinkedListNode head) {
        while(head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    public static SinglyLinkedListNode insertAtBeginning(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        node.next = head;
        head = node;
        return head;
    }

    public static SinglyLinkedListNode insertAtPosition(SinglyLinkedListNode head, int position, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if(head == null)
            return node;
        SinglyLinkedListNode temp = head;
        int i;
        for(i=1; i<position-1 && (temp != null && temp.next != null); i++) {
            temp = temp.next;
        }
        if(temp.next==null) {
             temp.next = node;
             return head;
        }
        node.next = temp.next;
        temp.next = node;
        return head;
    }

    public static SinglyLinkedListNode insertAtEnding(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode temp = head;
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        while(temp != null && temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        return head;
    }

    public static SinglyLinkedListNode createSingleLinkedList(int n) {
        SinglyLinkedListNode list = null, result = null;
        for(int i=1; i<=n; i++) {
            SinglyLinkedListNode temp = new SinglyLinkedListNode(i*10);
            if(list == null) {
                list = temp;
                result = list;
            } else {
                list.next = temp;
                list = list.next;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        SinglyLinkedListNode head = null;
        head = createSingleLinkedList(5);
        printList(head);
        head = insertAtBeginning(head, 60);
        System.out.println();
        printList(head);
        System.out.println();
        head = insertAtEnding(head, 100);
        printList(head);
        System.out.println();
        head = insertAtPosition(head, 10, 4);
        printList(head);
        System.out.println();
    }
}
