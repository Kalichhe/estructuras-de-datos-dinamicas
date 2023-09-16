package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    private static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) {
        //initializationLinkedList();
        //initializationStack();
        //initializationQueue();
        //invertStackIntegerWithOnlyStack();
        // invertQueueIntegerWithOnlyQueue();

        // Desde aquí me toca llamar y pasar los parametros
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        
        System.out.println("Cola original:");
        printQueue();
    
        System.out.println("Invertir cola:");
        invertQueueIntegerWithOnlyQueue();
    
        System.out.println("Cola invertida:");
        printQueue();
    }

    private static void  initializationLinkedList(){
        //Create linkedlist of integers
        NodoInteger ni1 = new NodoInteger();
        ni1.value = 1;
        NodoInteger ni2 = new NodoInteger();
        ni2.value = 2;
        NodoInteger ni3 = new NodoInteger();
        ni3.value = 3;

        //Create linkedlist of chars
        NodoChar nc1 = new NodoChar();
        nc1.value = 'a';
        NodoChar nc2 = new NodoChar();
        nc2.value = 'b';
        NodoChar nc3 = new NodoChar();
        nc3.value = 'c';

        //Create linkedlist of strings
        NodoString ns1 = new NodoString();
        ns1.value = "Hello";
        NodoString ns2 = new NodoString();
        ns2.value = "World";
        NodoString ns3 = new NodoString();
        ns3.value = "!";

        //Link integers
        ni1.next = ni2;
        ni2.next = ni3;

        //Link chars
        nc1.next = nc2;
        nc2.next = nc3;

        //Link strings
        ns1.next = ns2;
        ns2.next = ns3;

        //Print integers
        NodoInteger ni = ni1;
        while (ni != null) {
            System.out.println(ni.value);
            ni = ni.next;
        }

        //Print chars
        NodoChar nc = nc1;
        while (nc != null) {
            System.out.println(nc.value);
            nc = nc.next;
        }

        //Print strings
        NodoString ns = ns1;
        while (ns != null) {
            System.out.println(ns.value);
            ns = ns.next;
        }
    }

    private static void initializationStack(){
        //Create stack of integers
        StackInteger si1 = new StackInteger();
        si1.push(1);

        //Create stack of chars
        StackChar sc1 = new StackChar();
        sc1.push('a');

        //Create stack of strings
        StackString ss1 = new StackString();
        ss1.push("Hello");

        si1.push(2);
        si1.push(3);

        sc1.push('b');
        sc1.push('c');

        ss1.push("World");
        ss1.push("!");

        //Print integers
        while (!si1.isEmpty()) {
            System.out.println(si1.pop());
        }

        //Print chars
        while (!sc1.isEmpty()) {
            System.out.println(sc1.pop());
        }

        //Print strings
        while (!ss1.isEmpty()) {
            System.out.println(ss1.pop());
        }

    }

    private static void initializationQueue(){
        //Create queue of integers
        QueueInteger qi1 = new QueueInteger();
        qi1.enqueue(1);

        //Create queue of chars
        QueueChar qc1 = new QueueChar();
        qc1.enqueue('a');

        //Create queue of strings
        QueueString qs1 = new QueueString();
        qs1.enqueue("Hello");

        qi1.enqueue(2);
        qi1.enqueue(3);

        qc1.enqueue('b');
        qc1.enqueue('c');

        qs1.enqueue("World");
        qs1.enqueue("!");

        //Print integers
        while (!qi1.isEmpty()) {
            System.out.println(qi1.dequeue());
        }

        //Print chars
        while (!qc1.isEmpty()) {
            System.out.println(qc1.dequeue());
        }

        //Print strings
        while (!qs1.isEmpty()) {
            System.out.println(qs1.dequeue());
        }
    }

    private static void invertStackIntegerWithOnlyStack(){
        StackInteger si1 = new StackInteger();
        si1.push(1);
        si1.push(2);
        si1.push(3);

        StackInteger si2 = new StackInteger();
        while (!si1.isEmpty()) {
            si2.push(si1.pop());
        }

        while (!si2.isEmpty()) {
            System.out.println(si2.pop());
        }
    }

    // Desde aquí estan los cambias
    public static void invertQueueIntegerWithOnlyQueue() {
        
        if (queue.isEmpty() || queue.size() == 1) {
            return;
        }

        int item = queue.remove();
        invertQueueIntegerWithOnlyQueue();
        queue.add(item);
    }

    // Ahí hay un for, para poder imprimir los números cada vez que se desencole y encole
    public static void printQueue() {
        for (int item : queue) {
            System.out.println(item);
        }
    }

    
}