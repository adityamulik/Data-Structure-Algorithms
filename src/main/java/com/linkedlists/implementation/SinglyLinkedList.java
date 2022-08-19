package com.linkedlists.implementation;

public class SinglyLinkedList {
    /*
     * 
     */
    private ListNode head;
    private int length;

    public SinglyLinkedList() {
        // Empty Constructor
    }

    public ListNode getHead() {
        return head;
    }

    public synchronized void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
        length++;
    }

    public synchronized void insertAtEnding(int data) {
        // implementation pending
        length++;
    }

    public int lengthOfLinkedList() {
        return length;
    }
}
