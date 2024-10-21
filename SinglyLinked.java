import java.util.Iterator;
import java.util.NoSuchElementException;

class SinglyLinked<E> {
    private Node<E> head;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

 
    public void add(E data) {
        if (head == null) {
            head = new Node<>(data);
        } else {
            Node<E> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node<>(data);
        }
    }


    public Iterator<E> iterator() {
        return new SinglyLinkedListIterator<>(head);
    }

 
    private static class SinglyLinkedListIterator<E> implements Iterator<E> {
        private Node<E> current;

        SinglyLinkedListIterator(Node<E> head) {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.data;
            current = current.next;
            return data;
        }
    }
}
