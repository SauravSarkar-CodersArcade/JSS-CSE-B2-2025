package DataStructures.LinkedLists.SLL.ReverseLL;
class Node{
    int Value;
    Node next;
}
public class Main {
    public static void printList(Node node){
        while (node != null){
            System.out.print(node.Value + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }
    public static Node reverseLinkedList(Node head){
        // Edge case || Corner case
        // head is null(empty) or head.next is null(single node)
        if(head == null || head.next == null){
            return head;
        }
        // Multiple nodes
        Node prev = null;
        Node curr = head;
        Node forward = null;
        while (curr != null){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node();
        Node second = new Node();
        Node third = new Node();
        head.Value = 1;
        second.Value = 2;
        third.Value = 3;
        head.next = second;
        second.next = third;
        third.next = null; // 1 -> 2 -> 3 -> null
        System.out.println("Original Linked List: ");
        printList(head);
        head = reverseLinkedList(head);
        System.out.println("Reversed Linked List: ");
        printList(head);
    }
}
