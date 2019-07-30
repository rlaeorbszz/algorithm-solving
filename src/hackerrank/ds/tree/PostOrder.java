package hackerrank.ds.tree;

public class PostOrder {
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
    	
    	if(root.right!=null)
    	{
    		postOrder(root.right);
    	}
    	
    	System.out.print(root.data + " ");
    }
}