import java.util.Arrays;

class ArrayList<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

 
    public void add(E element) {
        ensureCapacity();
        elements[size++] = element;
    }

    
    public E removeLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("List is empty.");
        }
        E removedElement = (E) elements[--size];
        elements[size] = null; 
        return removedElement;
    }


    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

   
    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    
    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
    }
}
