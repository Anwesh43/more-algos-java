package ds;
public class Stack<T> {
    private Node<T> root;
    public void push(T data) {
        Node curr = new Node(data);
        if (root == null) {
            root = curr;
        } else {
            curr.next = root;
            root = curr;
        }
    }

    public T poll() {
        if (root == null) {
            return null;
        }
        return root.data;
    }

    public T pop() {
        if (root == null) {
            return null;
        }
        Node<T> curr = root;
        root = root.next;
        return curr.data;
    }
}
