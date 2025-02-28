package linkedlist.Single;

import linkedlist.Single.SinglyLinkedListNode;

public class MergeList {
    public static void printList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
    }
    public static int length(SinglyLinkedListNode head) {
        int len = 0;
        while (head != null) {
            len+=1;
            head = head.next;
        }
        return len;
    }
    // replace i-j nodes from list1 with list2
    public static void mergeLists(SinglyLinkedListNode list1, SinglyLinkedListNode list2, int i, int j) {
        SinglyLinkedListNode result = list1;
        SinglyLinkedListNode tailStart = null;
        SinglyLinkedListNode headEnd = null;
        // 1-2-3-4-5
        int pos = 1;
        j+=1;
        while(list1 != null && pos <= j) {
            if(pos == i-1){
                headEnd = list1;
            } else if (pos == j) {
                tailStart = list1;
            }
            list1 = list1.next;
            pos+=1;
        }
        headEnd.next = list2;
        while(list2 != null && list2.next != null) {
            list2 = list2.next;
        }
        list2.next = tailStart;

    }
    public static void main(String[] args) {
        SinglyLinkedListNode list1 = new SinglyLinkedListNode(10);
        list1.next = new SinglyLinkedListNode(20);
        list1.next.next = new SinglyLinkedListNode(30);
        list1.next.next.next = new SinglyLinkedListNode(40);

        SinglyLinkedListNode list2 = new SinglyLinkedListNode(1);
        list2.next = new SinglyLinkedListNode(2);
        list2.next.next = new SinglyLinkedListNode(3);
        list2.next.next.next = new SinglyLinkedListNode(4);

        mergeLists(list1, list2, 2,3);
        printList(list1);

    }
}
