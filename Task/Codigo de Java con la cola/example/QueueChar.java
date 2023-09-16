package org.example;

public class QueueChar {
    NodoChar first;
    NodoChar last;

    public QueueChar() {
        first = null;
        last = null;
    }

    public void enqueue(char value) {
        NodoChar newNode = new NodoChar();
        newNode.value = value;
        newNode.next = null;
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public char dequeue() {
        char value = first.value;
        first = first.next;
        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
