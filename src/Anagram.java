import java.util.HashMap;
public class Anagram {

 static void isAnagram(String s1, String s2)
 {
   //Removing white spaces 
   String str1 = s1.replaceAll("\\s", "").toLowerCase();
   String str2 = s2.replaceAll("\\s", "").toLowerCase();
 
   boolean status = true;
 
   if(str1.length() != str2.length())
     status = false;
   else
   {
     HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
     for(int i = 0; i < str1.length(); i++)
     {
       char ch = str1.charAt(i);
       int count = 0;
 
       if(hm.containsKey(ch))
         count = hm.get(ch);
                
      hm.put(ch, ++count);
      ch = str2.charAt(i);
      count = 0;
      if(hm.containsKey(ch))
         count = hm.get(ch);
                
      hm.put(ch, --count);
     }

     for(int value : hm.values())
     {
       if(value != 0)
          status = false;
     }
   }
 
  if(status)
    System.out.println(s1+" and "+s2+" are anagrams");
  else
    System.out.println(s1+" and "+s2+" are not anagrams");
 }
 
 public static void main(String[] args)
 {
   isAnagram("Eleven plus two", "Twelve plus one");
 }
}
