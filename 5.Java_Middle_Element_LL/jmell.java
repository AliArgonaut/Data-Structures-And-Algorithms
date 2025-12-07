
class Node {
    int data;
    Node next = null;
}

public class jmell {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data = 1;

        Node node2 = new Node();
        node2.data = 2;
        node1.next = node2;

        Node node3 = new Node();
        node3.data = 3;
        node2.next = node3;

        Node node4 = new Node();
        node4.data = 4;
        node3.next = node4;

        Node node5 = new Node();
        node5.data = 5;
        node4.next = node5;

        int length = findLengthOfLL(node1);
        int middle;

        if (length % 2 != 0) {
            middle = (length / 2 + 1);
        } else {
            middle = length / 2;
        }

        Node head = node1;
        for (int i = 1; i < middle; i++) {
            head = head.next;
        }
        System.out.println(head.data); // middle nodes value
    }

    public static int findLengthOfLL(Node head) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;

    }
}
