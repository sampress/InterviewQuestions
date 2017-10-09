import java.util.LinkedList;
import java.util.Queue;
public class treeLevelOrder {
	
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
	 
	 public void levelOrder()
	 {
		 if(root == null)
			 return;
		 Queue<TreeNode> q = new LinkedList<TreeNode>();
		 q.add(root);
		 while(!q.isEmpty())
		 {
			 TreeNode current = q.poll();
			 System.out.println(current.data + "");
			 
			 if(current.left !=  null)
				 q.add(current.left);
			 if(current.right != null)
				 q.add(current.right);
		 }
		 
	 }
	 
	 public static void main(String[] args)
	 {
		 treeLevelOrder tl = new treeLevelOrder();
		 tl.insert(1);
		 tl.insert(6);
		 tl.insert(3);
		 tl.insert(4);
		 tl.insert(5);
		 tl.insert(7);
		 tl.levelOrder();
		 
		 
		 
		 
		 
		 
	 }
	
}
