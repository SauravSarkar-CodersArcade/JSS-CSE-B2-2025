package DataStructures.LinkedLists.SLL;
class LL {
    Node head;
    private int size;
    LL(){
        size = 0;
    }
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void printList(){
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        // Empty list
        if(head == null){
            head = newNode;
            return;
        }
        // List with multiple nodes
        Node lastNode = head;
        while (lastNode.next != null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Empty list, nothing to delete.");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("Empty list, nothing to delete.");
            return;
        }
        size--;
        // Single Node
        if(head.next == null){
            head = null;
            return;
        }
        // Multiple nodes
        Node curr = head;
        Node last = head.next;
        while (last.next != null){
            curr = last;
            last = last.next;
        }
        curr.next = null;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("Vikas");
        list.addLast("CSE");
        list.addLast("Student");
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println(list.getSize());
    }
}

