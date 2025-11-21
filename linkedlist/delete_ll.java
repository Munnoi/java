package linkedlist;

class Node {
    int data;
    Node next;
    Node (int data) {
        this.data = data;
        this.next = null;
    }
}

public class delete_ll {
    Node head;
    public void deleteNode(int data) {
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == data) {
                if (prev == null)
                    head = temp.next;
                else
                    prev.next = temp.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
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
        delete_ll obj = new delete_ll();
        obj.head = new Node(1);
        obj.head.next = new Node(2);
        obj.head.next.next = new Node(3);
        obj.printList();
        obj.deleteNode(2);
        obj.printList();
    }
}
