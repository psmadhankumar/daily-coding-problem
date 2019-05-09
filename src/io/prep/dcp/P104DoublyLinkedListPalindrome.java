package io.prep.dcp;

public class P104DoublyLinkedListPalindrome {

	public static void main(String[] args) {
		
		
		Node head = generateInput();
		Node tail = getTailNode(head);
		
		Node left = head;
		Node right = tail;
		boolean isPalindrome = true;
		while(left != right || left.next == right) {
			if(left.value == right.value) {
				left = left.next;
				right = right.previous;
				continue;
			}
			else {
				isPalindrome = false; 
				break; 
				}
		}
		
		if(isPalindrome) { System.out.println("It is palindrome"); }
		else {System.out.println("Not a palidrome"); }
	}
	
	
	private static Node getTailNode(Node node) {		
		return node.next == null ? node : getTailNode(node.next);
	}


	private static Node generateInput() {
		Node a = new Node();
		a.value = 1;
		
		Node b = new Node();
		b.value = 4;
		b.previous = a;
		a.next = b;
		
		Node c = new Node();
		c.value = 3;
		c.previous = b;
		b.next = c;
		
		Node d = new Node();
		d.value = 4;
		d.previous = c;
		c.next = d;
		
		Node e = new Node();
		e.value = 1;
		e.previous = d;
		d.next = e;
		
		return a;
		
	}
	
	static class Node {
		
		Node previous;
		Node next;
		int value;
	}

}
