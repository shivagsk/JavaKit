package linkedlist.Single;

import java.util.Stack;

public class ReverseList {
    public static void printListRec(SinglyLinkedListNode head) {
        if(head == null)
            return ;
        printListRec(head.next);
        System.out.print(head.data + " -> ");
    }

    public static void printListIter(SinglyLinkedListNode head) {
        Stack<SinglyLinkedListNode> stack = new Stack<>();

        while(head != null) {
            stack.add(head);
            head = head.next;
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop().data + " -> ");
        }
    }
    public static void main(String[] args) {
       SinglyLinkedListNode head = NodeInsertions.createSingleLinkedList(5);
       printListRec(head);
       System.out.println();
       printListIter(head);
    }
}
