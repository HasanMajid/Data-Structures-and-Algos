public class Stack {
    private static class Node {
        private int data;
        private Node prev;

        private Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        Node node = new Node(data);
        node.prev = top;
        top = node;
    }

    public int pop() {
        int data = top.data;
        top = top.prev;
        return data;
    }

    @Override
    public String toString() {
        String output = "";
        Node current = this.top;
        while (current != null) {
            if (current.prev == null) {
                output += current.data;
            } else {
                output += current.data + ", ";
            }
            current = current.prev;
        }
        return output;

    }
}
