package com.bridgelabz;

public class LinkedListMain {

	public static void main(String[] args) {
		//creating object of MyNode and putting value 
		MyNode<Integer> firstNode = new MyNode<Integer>(70);
		MyNode<Integer> secondNode = new MyNode<Integer>(30);
		MyNode<Integer> thirdNode = new MyNode<Integer>(56);
		//creating object of linked list main and assigning value for next
		LinkedListCustom listnew = new LinkedListCustom();
		listnew.add(firstNode);
		listnew.add(secondNode);
		listnew.add(thirdNode);

		listnew.dispalyLinkedList();
	}

}
