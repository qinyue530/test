package com.qy.tree;

import java.util.Stack;
import java.util.Vector;

public class CengTree {
	int value;
	CengTree left;
	CengTree right;
	CengTree(){}
	CengTree(int value){this.value = value;}
	
	public static void getCengTree(CengTree cengtree) {
		int popCount = 1 , pushCount = 1;
		Vector<CengTree> vector  = new Vector<CengTree>(); 
		if(cengtree!=null) {
			vector.add(cengtree);
			while(!vector.isEmpty()) {
				CengTree node = vector.remove(0);
				System.out.print(node.value);
				if(node.left!=null)vector.add(node.left);
				if(node.right!=null)vector.add(node.right);
				if(popCount++ == pushCount) {
					System.out.println();
					popCount = 1;
					pushCount = vector.size();
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		CengTree ceng = new CengTree(0);
		CengTree ceng1 = new CengTree(1);
		CengTree ceng2 = new CengTree(2);
		CengTree ceng3 = new CengTree(3);
		CengTree ceng4 = new CengTree(4);
		CengTree ceng5 = new CengTree(5);
		CengTree ceng6 = new CengTree(6);
		CengTree ceng7 = new CengTree(7);
		CengTree ceng8 = new CengTree(8);
		ceng.left = ceng1;
		ceng.right = ceng2;
		ceng1.left = ceng3;
		ceng1.right = ceng4;
		ceng2.left = ceng5;
		ceng2.right = ceng6;
		ceng3.left = ceng7;
		ceng3.right = ceng8;
		getCengTree(ceng);
	}
}
