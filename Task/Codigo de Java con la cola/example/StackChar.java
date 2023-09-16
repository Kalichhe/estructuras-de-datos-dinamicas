package org.example;

public class StackChar {
    NodoChar top;

    public StackChar() {
        top = null;
    }

    public void push(char value) {
        NodoChar newNode = new NodoChar();
        newNode.value = value;
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        char value = top.value;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
