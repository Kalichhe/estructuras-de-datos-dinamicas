package org.example;

public class StackString {
    NodoString top;

    public StackString() {
        top = null;
    }

    public void push(String value) {
        NodoString nodo = new NodoString();
        nodo.value = value;
        nodo.next = top;
        top = nodo;
    }

    public String pop() {
        String value = top.value;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
