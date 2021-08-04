package com.aravind.singlylinkedlists;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    
    public SinglyLinkedList(Node head) {
    	this.head = head;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    public void remove() {
    	Node runner = this.head;
    	while(runner.next.next != null) {
    		runner = runner.next;
    	}
    	runner.setNext();
    }
    
    public void printValues() {
    	Node runner = this.head;
    	while(runner.next != null) {
    		System.out.println(runner.value);
    		runner = runner.next;
    	}
    	System.out.println(runner.value);
    }
    
    public Node find(int value) {
    	Node runner = this.head;
    	Node temp = null;
    	while(runner != null) {
    		if(runner.value == value) {
    			temp = runner;
    			break;
    		} else {    			
    			runner = runner.next;
    		}
    	}
    	return temp;
    }
    
//    public void removeAt(int nthNode) {
//    	Node runner = this.head;
//    	if(nthNode == 0) {
//    		this.head = runner.next;
//    	} else {
//    		for(int i = 0; i < nthNode; i++) {
//    			if(runner == null) {
//    				System.out.println("The specified node does not exist!");
//    				break;
//    			}
//    			runner = runner.next;
//    		}
//    		if(runner.next == null) {
//    			this.remove();
//    		} else {
//    			
//    		}
//    	}
//    }
}

