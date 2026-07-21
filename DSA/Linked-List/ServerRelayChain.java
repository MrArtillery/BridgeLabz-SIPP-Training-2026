class Node {
    int serverId;
    Node next;

    Node(int serverId) {
        this.serverId = serverId;
        this.next = null;
    }
}

public class ServerRelayChain {

    // Find the middle server
    public static Node findMiddleServer(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Display server chain
    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.serverId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);
        head.next.next.next.next = new Node(105);

        System.out.println("Server Relay Chain:");
        display(head);

        Node middle = findMiddleServer(head);

        System.out.println("\nMiddle Server: " + middle.serverId);
    }
}
