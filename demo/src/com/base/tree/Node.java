package com.base.tree;

public class Node {
		int value;
		Node left;
		Node right;
		public Node() {
		}
		public Node(int value) {
			this.value = value;
		}
	public static void getNode(Node node, int level) {
		if (node != null && level != 0) {
			getNode(node.left, level - 1);
			getNode(node.right, level - 1);
		} else
			System.out.print(node.value +" ");
	}

	public static void main(String[] args) {
		Node node = new Node(0);
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		node.left = node1;
		node.right = node2;
		node1.left = node3;
		node1.right = node4;
		node2.left = node5;
		node2.right = node6;
		node3.left = node7;
		node3.right = node8;
		for(int i = 0 ;  ; i++) {
			try {
				getNode(node, i);
				System.out.println();
			}catch (Exception e) {
				System.out.println("程序终止");
				break;
			}
		}
	}
}
