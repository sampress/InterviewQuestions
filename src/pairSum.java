import java.util.Hashtable;
import java.util.HashSet;

public class pairSum {
	public static void pairSum(int[] arr, int k)
	{
	HashSet<Integer> seen = new HashSet<Integer>();
	Hashtable output = new Hashtable();

	for(int num = 0; num<arr.length; num++)
	{
		int target = k-arr[num];
		
		if(!seen.contains(target))
			seen.add(arr[num]);
		else
			output.put(num, target);
	}
	
	 System.out.print(output);

	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4};
		int k = 5;
		pairSum(arr, k);
	}
}
