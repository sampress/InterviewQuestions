import java.util.Arrays;

public class findMissingNumber {

 public static int findMissingNumber(int[] a, int[] b)
 {
	int result = 0;
		
    for(int num1 = 0; num1 < a.length; num1++)
	{
      result ^= a[num1];
			
	}
	
    for(int num2 = 0; num2 < b.length; num2++)
	{
	  result ^= b[num2];
	}
	
    return result;
  }
	
 public static void main (String[] args)
 {
    int [] a = {4,1,0,2,9,6,8,7,5,3};
    int [] b = {6,4,7,2,1,0,8,3,9};
        
    System.out.println("The missing number is : " +
        		findMissingNumber(a,b));
    }
}
