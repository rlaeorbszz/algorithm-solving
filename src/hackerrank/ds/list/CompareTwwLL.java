package hackerrank.ds.list;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * ref : https://www.hackerrank.com/challenges/compare-two-linked-lists/problem
 * 
 * @author kimdaekyun
 *
 */
public class CompareTwwLL {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

		public void insertNode(int nodeData) {
			SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

			if (this.head == null) {
				this.head = node;
			} else {
				this.tail.next = node;
			}

			this.tail = node;
		}
	}

	public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
			throws IOException {
		while (node != null) {
			bufferedWriter.write(String.valueOf(node.data));

			node = node.next;

			if (node != null) {
				bufferedWriter.write(sep);
			}
		}
	}

	// Complete the compareLists function below.

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode { int data; SinglyLinkedListNode next; }
	 *
	 */
	static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
		/*
		 * h1 [2] -> [6] - [8]
		 * 
		 * h2 [2] -> [6] -> [7]
		 * 
		 */
		while (head1 != null && head2 != null) {
			if (head1.data == head2.data) {
				head1 = head1.next;
				head2 = head2.next;
			} else {
				return false;
			}
		}
		
//		if (head1 == null && head2 != null) {
//			return false;
//		} else if (head1 != null && head2 == null) {
//			return false;
//		} else {
//			return true;
//		}
		
//		if(head1==null&&head2==null)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		
		return head1==null&&head2==null;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int tests = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int testsItr = 0; testsItr < tests; testsItr++) {
			SinglyLinkedList llist1 = new SinglyLinkedList();

			int llist1Count = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llist1Count; i++) {
				int llist1Item = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist1.insertNode(llist1Item);
			}

			SinglyLinkedList llist2 = new SinglyLinkedList();

			int llist2Count = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < llist2Count; i++) {
				int llist2Item = scanner.nextInt();
				scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

				llist2.insertNode(llist2Item);
			}

			boolean result = compareLists(llist1.head, llist2.head);

			bufferedWriter.write(String.valueOf(result ? 1 : 0));
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
