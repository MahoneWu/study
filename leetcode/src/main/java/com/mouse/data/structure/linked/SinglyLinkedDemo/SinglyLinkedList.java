package com.mouse.data.structure.linked.SinglyLinkedDemo;

/**
 * Created by Mahone Wu on 2018/10/24.
 */
public class SinglyLinkedList {


    private Node head = null;


    public Node findbyValue(int value){
        Node p = head;
        while (p != null && p.data != value) {
            p = p.next;
        }
        return p;
    }

    public Node findByIndex(int index) {
        Node p = head;
        int pos = 0;
        while (p != null && pos != index) {
            p = p.next;
            ++pos;
        }
        return p;
    }

    public void insertToHead(int value) {
        Node newNode = new Node(value, null);
        insertToHead(newNode);
    }

    public void insertToHead(Node newNode) {
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAfter(Node p, int value) {
        Node newNode = new Node(value, null);
        insertAfter(p, newNode);
    }

    /**
     * 在某个节点后面插入数据
     * @param p
     * @param newNode
     */
    public void insertAfter(Node p, Node newNode) {
        if (p ==null) return;
        newNode.next = p.next;
        p.next = newNode;
    }


    public static  Node createNode(int value){
        return new Node(value, null);
    }



    public void printAll(){
        Node p = head;
        while (p != null) {
            System.out.print(p.data + "");
            p = p.next;
        }
        System.out.println();
    }





    public static class Node{

        private int data;

        private Node next;

        public Node(int data,Node next){
            this.data = data;
            this.next = next;
        }

        public int getData(){
            return data;
        }
    }

}
