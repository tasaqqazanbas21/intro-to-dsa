package LinkedList;

public class LinkedList<Type> {
	private int size = 0;
	private Node tailNode;
	private Node headNode;
	public static class Node<Type> {
		Type value;
		Node nextNode;
		public Node (Type value) {
			this.value = value;
			nextNode = null;
		}
	}
	public void insertAtHead (Type n) {
		Node<Type> newNode = new Node<Type>(n);			
		if (size == 0) {
			headNode = newNode;
			tailNode = newNode;
			size++;
		} else {
			newNode.nextNode = headNode;
			headNode = newNode;
			size++;
		}

	}
	public void insertAtTail (Type n) {
		Node<Type> newNode = new Node<Type>(n);
		if (size == 0) {
			headNode = newNode;
			tailNode = newNode;
			size++;
		} else {
			tailNode.nextNode = newNode;
			tailNode = newNode;
			size++;
		}
	}

	public void insertAtIndex (Type n, int index) {
		Node<Type> newNode = new Node<Type>(n);
		if (index > size) System.out.println("ERROR");
		else {
			Node current = headNode;
			int counter = 0;
			while (counter != index - 1) {
				current = current.nextNode;
				counter++;
			}
			Node temp = current.nextNode;
			current.nextNode = newNode;
			newNode.nextNode = temp;
			temp = null;
			size++;
		}
	}


	public void deleteAtHead() {
		if (size == 0) System.out.println("ERROR");
   		Node temp = headNode;
		headNode = headNode.nextNode;
		temp.nextNode = null;
	}

	public void deleteAtTail() {
		if (size == 0) System.out.println("ERROR");
		else {
			Node current = headNode;
		
			while (current.nextNode != tailNode) {
				current = current.nextNode;
			}
			current.nextNode = null;
		}
	}

	public static void main (String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.insertAtTail(1);
		ll.insertAtTail(2);
		ll.insertAtTail(3);
		ll.insertAtTail(4);
		ll.deleteAtTail();
		ll.deleteAtTail();
		Node current = ll.headNode;
		while (current != null) {
			System.out.println(current.value);
			current = current.nextNode;
		}
	}


}
