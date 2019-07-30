package hackerrank.ds;

import java.util.Stack;

public class GetNodeValue {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }
    
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
    	Stack<SinglyLinkedListNode> stack=new Stack<>();
    	while(head!=null)
    	{
    		stack.push(head);
    		head=head.next;
    	}
    	for(int i=0;i<positionFromTail;i++)
    	{
    		stack.pop();
    		
    	}
    	
    	// SinglyLinkedListNode node = stack.pop();
    	// return stack.pop().data;
    	
        return stack.pop().data;

    }

    
}
