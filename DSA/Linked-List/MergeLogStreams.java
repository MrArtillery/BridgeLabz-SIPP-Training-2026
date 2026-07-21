class Node {
    int timestamp;
    Node next;

    Node(int timestamp) {
        this.timestamp = timestamp;
        this.next = null;
    }
}

public class MergeLogStreams {

    // Merge two sorted linked lists
    public static Node mergeLogStreams(Node a, Node b) {

        Node dummy = new Node(0);
        Node tail = dummy;

        while (a != null && b != null) {

            if (a.timestamp <= b.timestamp) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (a != null) {
            tail.next = a;
        } else {
            tail.next = b;
        }

        return dummy.next;
    }

    // Display linked list
    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.timestamp + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        // First sorted log stream
        Node stream1 = new Node(10);
        stream1.next = new Node(20);
        stream1.next.next = new Node(40);

        // Second sorted log stream
        Node stream2 = new Node(15);
        stream2.next = new Node(25);
        stream2.next.next = new Node(30);
        stream2.next.next.next = new Node(50);

        System.out.println("Log Stream 1:");
        display(stream1);

        System.out.println("Log Stream 2:");
        display(stream2);

        Node merged = mergeLogStreams(stream1, stream2);

        System.out.println("\nMerged Log Stream:");
        display(merged);
    }
}
