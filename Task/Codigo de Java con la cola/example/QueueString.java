package org.example;

public class QueueString {
    NodoString front;
    NodoString rear;

    public QueueString() {
        front = null;
        rear = null;
    }

    public void enqueue(String value) {
        NodoString newNode = new NodoString();
        newNode.value = value;
        newNode.next = null;
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public String dequeue() {
        String value = front.value;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return value;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
