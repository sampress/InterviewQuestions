
public class BSTCheck {

	public class TreeNode {

		 public int data; // To store the value of the node
		 public TreeNode left, right; // Pointer to left and right node
					       
		 // To fill the node with the values given 
		 public TreeNode(int x)
		 {
		   data = x; 
		   left = right = null; 
				
		 }
		}
	
	 TreeNode root = null;
	 public void insert(int data)
	    {
	        root = Insert(root, data);
	    }
	 	
	 
	 public TreeNode Insert(TreeNode root, int data)
	 {
	   // If the tree is empty 
	   if(root == null)
	   {
		   root = new TreeNode(data);
	   }
	   // Condition to enter in the left subtree 
	   else if(data <= root.data)
		{
		  root.left = Insert(root.left, data);
		}
		// Condition to enter in the right subtree 
	    else
	    {
	  	  root.right = Insert(root.right, data);
	    }
	   return root;
	 }
	 
	 public boolean binarySearchTreeUtil(TreeNode root, int minValue, int maxValue)
	 {
	   if(root == null)
	     return true;
		 
	   /* minValue and maxValue set the range of values the node of each subtree can take 
	    for it to still be a BST.
	    The left subtree can have the range of (minValue, value of parent node)
	    The right subtree can have the range of (value of parent node, right)
	    */
	   if(root.data < minValue && root.data > maxValue 
			   && binarySearchTreeUtil(root.left, minValue, root.data) 
			   && binarySearchTreeUtil(root.right, root.data, maxValue))
		return true;
		else 
		 return false;
	 }
	 
	 public boolean isBinarySearchTree()
	 {
	   // MIN_VALE and MAX_VALUE is the range of the values the node can take (2^-31, 2^31)	 
	   return binarySearchTreeUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	 }
	 
	 int findMin(TreeNode root)
	 {
	     int minv = root.data;
	     while (root.left != null)
	     {
	         minv = root.left.data;
	         root = root.left;
	     }
	     return minv;
	 }
	
}
