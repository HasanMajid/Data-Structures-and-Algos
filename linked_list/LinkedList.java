
public class LinkedList {
    Node head;

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        this.head = newHead;
    }

    public void deleteWithValue(int data) {
        if (head == null)
            return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node current = this.head;

        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
        }

    }

    @Override
    public String toString() {
        String output = "";
        Node current = this.head;
        while (current != null) {
            if (current.next == null) {
                output += current.data;
            } else {
                output += current.data + ", ";
            }
            current = current.next;
        }
        return output;
    }
}
