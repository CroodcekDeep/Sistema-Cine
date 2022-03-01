/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractDataStructures;

/**
 *
 * @author User
 */
public class DoublyLinkedList<E> {
    // --- Nested Node Class -----
    public static class Node<E> {
        private E data;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            data = e;
            prev = p;
            next = n;
        }

        public E getData() {
            return data;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    //Variables de instancia de la Doubly Linked List
    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;


    public DoublyLinkedList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public E first() {
        if (isEmpty()) return null;
        return header.getNext().getData();
    }

    public E last() {
        if (isEmpty()) return null;
        return trailer.getPrev().getData();
    }

    // public update methodos
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }

    public void addLast(E e) {
        addBetween(e, trailer.getPrev(), trailer);
    }

    public E removeFirst() {
        if (isEmpty()) return null;
        return remove(header.getNext());
    }

    public E removeLast() {
        if (isEmpty()) return null;
        return remove(trailer.getPrev());
    }


    /***
     * @param position Index position of the dataStructure
     * @return return the key of the dataStructure
     */
    public E getData(int position) {
        Node<E> current = header.next;
        if (header.next == null) {
            return null;
        }

        int i = 0;
        while (i < position) {
            current = current.next;
            i++;
        }
        return current.getData();
    }

    public Node<E> getNode(int position) {
        Node<E> current = header.next;
        if (header.next == null) {
            return null;
        }

        int i = 0;
        while (i < position) {
            current = current.next;
            i++;
        }
        return current;
    }

//    public E getByName(Registro.Cliente cliente ){
//        // si vale ya les muestro jajaja que no puedo hablar
//        Node<E> current = header.next;
//        if(header.next == null){
//            return null ;
//        }
//        int i = 0;
//        while(current.next!=null){
//            if(current.getData() == )
//        }
//
//
//    }

    public void insertNth(E e, int position) {
        Node<E> node = new Node<>(e, null, null);
        if (header.next == null) {
            if (position != 0) {
                return;
            } else {
                header.next = node;
            }
        }

        if (header.next != null && position == 0) {
            addBetween(e, header, header.getNext());
            return;
        }

        Node<E> current = header.next;
        int i = 0;
        while (i < position) {
            current = current.next;
            i++;
        }
        if (position != 0) {
            node.setPrev(current.prev);
            node.setNext(current);
            current.prev.setNext(node);
            current.next.setPrev(node);
            size++;
        }
    }

    private void addBetween(E e, Node<E> prev, Node<E> next) {
        Node<E> newest = new Node<>(e, prev, next);
        prev.setNext(newest);
        next.setPrev(newest);
        size++;
    }

    private E remove(Node<E> node) {
        Node<E> prev = node.getPrev();
        Node<E> next = node.getNext();
        prev.setNext(next);
        next.setPrev(prev);
        size--;
        return node.getData();
    }

    public void show() {
        Node<E> temp = header.next;
        Node<E> finalTemp = trailer;
        while (temp != finalTemp) {
            System.out.print(temp.getData());
            temp = temp.next;
            if (temp != finalTemp) {
                System.out.print(" \n<--> ");
            }
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> myList = new DoublyLinkedList<>();
        myList.addFirst(2);
        myList.addLast(6);
        myList.addLast(3);
        myList.addLast(8);
        myList.show();
        System.out.println("\nSize: " + myList.size());
        myList.insertNth(24, 2);
        System.out.println("Nueva lista: ");
        myList.show();
        System.out.println("\nSize: " + myList.size());
        myList.insertNth(7, 0);
        System.out.println("Nueva lista: ");
        myList.show();
        System.out.println("\nSize: " + myList.size());
        System.out.println();
        System.out.println(myList.getData(3));
    }
}
