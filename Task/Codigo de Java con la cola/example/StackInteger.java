package org.example;

public class StackInteger {
    NodoInteger top;

    public StackInteger() {
        top = null;
    }

    public void push(int value) {
        NodoInteger nodo = new NodoInteger();
        nodo.value = value;
        nodo.next = top;
        top = nodo;
    }

    public int pop() {
        int value = top.value;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
