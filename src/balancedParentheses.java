import java.util.Stack;
public class balancedParentheses {

 public static boolean balancedParenthenses(String str)
 {
	Stack<Character> stack  = new Stack<Character>();
	for(int i = 0; i < str.length(); i++)
	{
	  char ch = str.charAt(i);
	  if(ch == '{' || ch == '(' || ch == '[' )     
	    stack.push(ch);
	  else if(ch == '}') 
	  {
	     if(stack.isEmpty() || stack.pop() != '{') 
	       return false;
	   } 
	  else if(ch == ')') 
	  {
	    if(stack.isEmpty() || stack.pop() != '(') 
	      return false;
	  }
	  else if(ch == ']') 
	  {
	   if(stack.isEmpty() || stack.pop() != '[') 
	     return false;
	  }
	}
	return stack.isEmpty();
   }
	    
 public static void main(String args[])
 {
   System.out.println(balancedParenthenses("{(a,b})"));
   
  }
 }
