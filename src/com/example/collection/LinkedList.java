package com.example.collection;

import java.util.Arrays;

public class LinkedList {

	public Node first;
	public Node last;
	public int size;
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList linkedList = new LinkedList();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		linkedList.add("f");
		System.out.println(linkedList);
		
	}
	
	public void add(String value) {
		if (first == null) {
			Node temp = new Node(value);
			first = temp;
			last = temp;
		} else {
			Node temp = new Node(value);
			last.next = temp;
			temp.previous = last;
			last = temp;
		}
		size++;
		
	}
	
	private String ToString() {
		// TODO Auto-generated method stub
		String[] str = new String[size];
		if (first == null) {
			return str.toString();
		} 
		Node temp = first;
		
		int index = 0;
		str[index] = first.value;
		while(temp.next != null) {
			temp = temp.next;
			str[++index] = temp.value;
		}
		return Arrays.toString(str);
	}
	
}
