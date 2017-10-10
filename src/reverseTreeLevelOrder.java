import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseTreeLevelOrder {
	
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
		 
 public void reverseLevelOrder()
 {
	if(root == null)
	  return;
    Stack<TreeNode> s = new Stack<TreeNode>(); 
    Queue<TreeNode> q = new LinkedList<TreeNode>();
    q.add(root);
    while(!q.isEmpty())
	{
       TreeNode current = q.poll();
	   s.push(current);
				 
	   if(current.left !=  null)
	     q.add(current.left);
	   if(current.right != null)
		 q.add(current.right);
	 }
			 
	 while(!s.isEmpty()) 
     {
	   System.out.print(s.pop().data + " ");
	 }
 }
		 
 public static void main(String[] args)
 {
   reverseTreeLevelOrder tl = new reverseTreeLevelOrder();
   tl.insert(1);
   tl.insert(6);
   tl.insert(3);
   tl.insert(4);
   tl.insert(5);
   tl.insert(7);
   tl.reverseLevelOrder();
 }
}



