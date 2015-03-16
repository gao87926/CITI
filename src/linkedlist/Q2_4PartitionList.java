package linkedlist;

public class Q2_4PartitionList {

	public LinkedListNode partition(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode beforeEnd = null;
		LinkedListNode afterStart = null;
		LinkedListNode afterEnd = null;
		// Partition list
		while (node != null) {
			LinkedListNode next = node.next;
			node.next = null;
			if (node.data < x) {
				// Insert node into end of beforeList
				if (beforeStart == null) {
					beforeStart = node;
					beforeEnd = beforeStart;
				} else {
					beforeEnd.next = node;
					beforeEnd = node;
				}
			} else {
				if (afterStart == null) {
					afterStart = node;
					afterEnd = node;
				} else {
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = node.next;
		}
		if (beforeStart == null) {
			return afterStart;
		}
		// merge before List and after List
		beforeEnd.next = afterStart;
		return beforeStart;
	}

	public static LinkedListNode partition1(LinkedListNode node, int x) {
		LinkedListNode beforeStart = null;
		LinkedListNode afterStart = null;
		while (node != null) {
			LinkedListNode next = node.next;
			if (node.data < x) {
				// insert node into start of before List
				node.next = beforeStart;
				beforeStart = node;
			} else {
				// insert node into front of after list
				node.next = afterStart;
				afterStart = node;
			}
			node = next;
		}
		// merge before list and after list
		if (beforeStart == null) {
			return afterStart;
		}
		// find end of before list, and merge the list
		LinkedListNode head = beforeStart;
		while (beforeStart.next != null) {

			beforeStart = beforeStart.next;
		}
		beforeStart.next = afterStart;
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
