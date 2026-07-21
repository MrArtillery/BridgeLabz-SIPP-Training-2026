class Node {
    int trackId;
    Node next;

    Node(int trackId) {
        this.trackId = trackId;
        this.next = null;
    }
}

public class PlaylistQueue {

    // Insert a new track after the current track
    public static void insertAfter(Node current, int trackId) {

        if (current == null) {
            return;
        }

        Node newNode = new Node(trackId);

        // Save the rest of the queue
        newNode.next = current.next;

        // Link current node to new node
        current.next = newNode;
    }

    // Display playlist
    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.trackId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(104);

        System.out.println("Before Insertion:");
        display(head);

        // Insert track 103 after track 102
        insertAfter(head.next, 103);

        System.out.println("\nAfter Insertion:");
        display(head);
    }
}
