package linkedlist;

class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class insert_at_beg {
    Node head;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        insert_at_beg obj = new insert_at_beg();
        obj.insertAtBeginning(1);
        obj.insertAtBeginning(2);
        obj.insertAtBeginning(3);

        obj.printList();
    }
}
