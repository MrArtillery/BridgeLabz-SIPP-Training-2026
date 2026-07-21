class Node {
    int urlId;
    Node next;

    Node(int urlId) {
        this.urlId = urlId;
        this.next = null;
    }
}

public class RedirectLoopDetection {

    // Detect cycle using Floyd's Cycle Detection Algorithm
    public static boolean hasRedirectLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            // Compare references
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Create redirect chain
        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);

        // Uncomment the following line to create a cycle
        head.next.next.next.next = head.next;

        if (hasRedirectLoop(head)) {
            System.out.println("Redirect loop detected.");
        } else {
            System.out.println("No redirect loop found.");
        }
    }
}
