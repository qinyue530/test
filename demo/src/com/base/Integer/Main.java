package com.base.Integer;

import java.util.Scanner;

class Node {
	int nData;
	Node pNext;

	public Node() {
		
	}

	public Node(int nData, Node pNext) {
		this.nData = nData;
		this.pNext = pNext;
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Node node = new Node();
		Node head = node ;
		boolean bool = true;
		while (bool) {
			int data = sc.nextInt();
			if (data != 0) {
				node.nData = data;
				node.pNext = new Node();
				node = node.pNext;
			}else {
				node = null;
				bool = false;
			}
		}
		int k = sc.nextInt();
		System.out.println(findNkthNode(head , k).nData);
		
	}
	
	public static Node findNkthNode(Node pList , int k) {
		Node before = pList;
		Node after = pList;
		int bl = 0;
		int al = 1;
		while(after!= null && after.nData!=0) {
			
			if(al/k >bl) {
				bl++;
				before = before.pNext;
//				System.out.println("---" + before.nData);
			}
			al++;
//			System.out.println("------------------" + after.nData);
			after = after.pNext;
		}
		return before;
	}

}
