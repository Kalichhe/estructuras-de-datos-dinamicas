
public class Nodo {
    public static void nodo(String[] args) {
        Node list = null; // Inicialmente, la lista está vacía

        // Agregar varios números a la lista en orden ascendente
        list = addNodeList(list, new Node(0));
        list = addNodeList(list, new Node(4));
        list = addNodeList(list, new Node(7));
        list = addNodeList(list, new Node(1));
        list = addNodeList(list, new Node(5));
        list = addNodeList(list, new Node(9));
        list = addNodeList(list, new Node(3));
        list = addNodeList(list, new Node(8));
        list = addNodeList(list, new Node(6));
        list = addNodeList(list, new Node(2));

        // Imprimir la lista resultante
        printList(list);
    }
    public static Node addNodeList(Node list, Node x) {
        if (list == null) {
            return x;
        }

        if (x.value < list.value) {
            x.next = list;
            return x;
        }

        if (x.value == list.value) {
            return list;
        }
        list.next = addNodeList(list.next, x);
        return list;
    }
    public static void printList(Node list) {
        if (list != null) {
            System.out.print(list.value + " ");
            printList(list.next);
        }
    }
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
