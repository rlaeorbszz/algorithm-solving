package hackerrank.ds.list;
/**
 * ref : https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem
 * 
 * @author kimdaekyun
 *
 */
public class MergeTwoLL {

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
    
    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    	/*              ha
    	 *  03->  07->  11->  12
    	 *  
    	 *                  hb
    	 *  05->  09->  10
    	 *  
    	 *            m
    	 *  3 7 11 12 
    	 *  5 9 10
    	 */
    	// SinglyLinkedListNode aux = null;
    	SinglyLinkedList aux = new SinglyLinkedList();
    	// aux.insertNode(nodeData);
    	while(head1!=null&&head2!=null)
    	{
    		if(head1.data<head2.data)
    		{
    			aux.insertNode(head1.data);
    			head1=head1.next;
    		}
    		else
    		{
    			aux.insertNode(head2.data);
    			head2=head2.next;
    		}
    	}
    	while(head1!=null)
    	{
    		aux.insertNode(head1.data);
    		head1=head1.next;
    	}
    	while(head2!=null)
    	{
    		aux.insertNode(head2.data);
    		head2=head2.next;
    	}
    	return aux.head;
    }
}
