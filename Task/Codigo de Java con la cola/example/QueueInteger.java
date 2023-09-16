package org.example;

public class QueueInteger {
    NodoInteger first;
    NodoInteger last;

    public QueueInteger() {
        first = null;
        last = null;
    }

    public void enqueue(int value) {
        NodoInteger newNode = new NodoInteger();
        newNode.value = value;
        newNode.next = null;
        if (last == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
    }

    public int dequeue() {
        int value = first.value;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
