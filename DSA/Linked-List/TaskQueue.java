class Node {
    int taskId;
    Node next;

    Node(int taskId) {
        this.taskId = taskId;
        this.next = null;
    }
}

public class TaskQueue {

    // Remove completed task from the queue
    public static Node removeTask(Node head, int taskId) {

        if (head == null) {
            return null;
        }

        // Remove first node
        if (head.taskId == taskId) {
            return head.next;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }

    // Display task queue
    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.taskId + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);

        System.out.println("Before Deletion:");
        display(head);

        // Remove task 103
        head = removeTask(head, 103);

        System.out.println("\nAfter Deletion:");
        display(head);
    }
}
