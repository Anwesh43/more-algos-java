package ds;
public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
