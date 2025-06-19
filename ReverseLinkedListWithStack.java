import java.util.Stack;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListWithStack {

    // Function to reverse using stack
    public static Node reverseLinkedList(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        // Push all node data to stack
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        // Replace node data with popped values
        temp = head;
        while (temp != null) {
            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;
    }

    // Function to print linked list
    public static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 3 -> 2 -> 4
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);

        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list using stack
        head = reverseLinkedList(head);

        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
