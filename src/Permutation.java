public class Permutation
{
    
	public static void permutation(String str) { 
	    permutationUtil("", str); 
	}

	public static void permutationUtil(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutationUtil(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
    
    public static void main(String[] args)
    {
        String str = "ABC";
        permutation(str);
       
    }
 
}
 