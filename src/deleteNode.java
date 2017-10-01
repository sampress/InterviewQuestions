
public class deleteNode {

	public class Node {

	public int data; // To store the value of the node
	public Node next; // Pointer to next node
				       
	// To fill the node with the values given 
	public Node(int x)
	{
	  data = x; 
	  next = null;
    }
  }
  static Node head;

  public void insertAtBeggining(int x)
  {
   // Creating a new node and shifting the head pointer to the new node 
	  Node newNode = new Node(x);
   // Creates a link b/w the new node and previous 1st node
	  newNode.next = head;
   // Now set the head pointer to the new node
	  head = newNode;
  }
	
  public void removeNode(Node head, int toRemove)
  {
		
	Node previous = null;
	Node current = head;
		
    while(current != null)
    {
      if(current.data == toRemove)
	  {
	   if(current == head)
	      head = current.next;
	   else 
		 previous.next = current.next;
		 
	   }
      else 
		 previous = current;
		 
		 
		 current = current.next;
	  }
	 }
	
	public void print(Node head)
	{
	  while(head != null)
	  {
	   // Keep printing till we reach null
		  System.out.print(head.data+" ");
		  head = head.next;
      }
	 }
	
	 public static void main(String[] args)
	 {
	   deleteNode list = new deleteNode();
				 
	  // Creating the list
	   list.insertAtBeggining(3);
	   list.insertAtBeggining(4);
	   System.out.println("Linked list is: ");
	   list.print(list.head);
	   System.out.println("");
					
	   System.out.println("Deleting element with value 3");
	   list.removeNode(list.head,3);
	   
	   System.out.println("Linked list is: ");
	   list.print(list.head);
	   System.out.println("");
	 }
}
