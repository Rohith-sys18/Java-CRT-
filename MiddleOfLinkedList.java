class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleOfLinkedList {

    // Function to find the middle node
    public static Node middleNode(Node head) {
        int count = 0;
        Node temp = head;

        // Count total nodes
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Traverse to middle
        int mid = count / 2;
        temp = head;
        while (mid > 0) {
            temp = temp.next;
            mid--;
        }

        return temp;
    }

    // Function to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create Linked List: 1 -> 3 -> 2 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printList(head);

        Node mid = middleNode(head);
        System.out.print("Linked List From Middle: ");
        printList(mid);
    }
}
