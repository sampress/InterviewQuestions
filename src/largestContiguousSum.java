
public class largestContiguousSum {

	
 
   public static int largestContiguousSum(int[] a)
    {
        int size = a.length;
        int maxSum = Integer.MIN_VALUE;
        int currentSum  = 0;
 
        for (int i = 0; i < size; i++)
        {
            currentSum = currentSum + a[i];
            if (maxSum < currentSum)
                maxSum = currentSum;
            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
    
    public static void main (String[] args)
    {
        int [] a = {1, -9, 10, -2, -5};
        
        System.out.println("The largest contiguous sum is : " +
        		largestContiguousSum(a));
    }
	
}
