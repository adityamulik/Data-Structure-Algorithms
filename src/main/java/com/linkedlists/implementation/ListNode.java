package com.linkedlists.implementation;

public class ListNode {
    /*
     * 
     */
    private int data;
    private ListNode next;

    public ListNode() {
        // empty constructor
    }

    public ListNode(int data) {
        this.data = data;
        next = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public ListNode getNext() {
        return this.next;
    }
}
