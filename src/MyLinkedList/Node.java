package MyLinkedList;

class Node<E> {
    private E currentElement;
    private Node<E> nextElement;
    private Node<E> previousElement;

    Node(E currentElement, Node<E> previousElement, Node<E> nextElement) {
        this.currentElement = currentElement;
        this.nextElement = nextElement;
        this.previousElement = previousElement;
    }
}
