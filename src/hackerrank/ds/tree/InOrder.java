package hackerrank.ds.tree;

public class InOrder {
	/*
	 *    50
	 *  NL    60
	 *       58   71
	 *       
	 *  58 71 60 50
	 */

    public static void postOrder(Node root) {

    	if(root.left!=null)
    	{
    		postOrder(root.left);
    		
    	}
    	
    	System.out.print(root.data + " ");
    	
    	if(root.right!=null)
    	{
    		postOrder(root.right);
    	}
    	
    }
}