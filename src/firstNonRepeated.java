import java.util.HashMap;
public class firstNonRepeated {

 public static Character firstNonRepeated(String str)
 {
   HashMap<Character,Integer>  ht = new HashMap<Character ,Integer>();
   char ch ;
   for(int i = 0; i < str.length(); i++)
   {
     ch = str.charAt(i);
     if(ht.containsKey(ch))
       ht.put(ch, ht.get(ch) + 1);
     else
       ht.put(ch, 1) ;
    }
        
    for(int i = 0; i < str.length(); i++ )
    {
      ch = str.charAt(i);
      if(ht.get(ch)  == 1)
        return ch;
    }
    return null ;
  }
    
  public static void main(String[] args)
  {        
	String str = "HelloH";
    char ch = firstNonRepeated(str);
    System.out.println("The first non repeated character is :  " + ch);
  }
}
