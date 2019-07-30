package hackerrank.ds.tree;
/**
 * ref: https://www.hackerrank.com/challenges/tree-height-of-a-binary-tree/problem
 * @author kimdaekyun
 *
 */
public class HeighOfTree {

	public static int height(Node root) {
		if(root==null)
		{
			return -1;
		}
		else
		{
			int hLeft = height(root.left);
			int hRight = height(root.right);
			return Math.max(hLeft, hRight)+1;
		}
      	
	}
}
