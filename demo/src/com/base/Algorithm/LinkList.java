package com.base.Algorithm;

import java.util.Scanner;

class Node {
	
	public int data;
	public Node next;
	Node() {
		
	}
	Node(int date) {
		this.data = date;
		this.next = null;
	}
}
public class LinkList {
	public static void main(String[] args) {
		System.out.println("输入链表长度");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		Node node = new Node();
		Node head = new Node();
		head = node;
		for (int i = 0; i < length; i++) {
			int num = sc.nextInt();
			node.next = new Node(num);
			node = node.next;
		}
		node.next = null;
		head = head.next;
		
		Node before = head;
		
		int i = sc.nextInt();
		
		if(head.data == i) {
			head = head.next;
			before = head;
			System.out.println("首位");
		}
		else {
			while(head.next!=null) {
				if(head.next.data == i) {
					head.next = head.next.next;
				}else
				head = head.next;
			}
		}
		while(before!=null) {
			System.out.println(before.data);
			before=before.next;
		}
		
		
	}
}
