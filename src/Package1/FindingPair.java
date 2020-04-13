package Package1;

public class FindingPair {
	
	
	    static void Elements(int arr[], int target)
	    {
	        System.out.println("The correct pairs that getting "+target+" after sum are : ");
	 
	        for (int i = 0; i < arr.length; i++)
	        {
	            for (int j = i+1; j < arr.length; j++)
	            {
	                if(arr[i]+arr[j] == target)
	                {
	                    System.out.println(arr[i]+" + "+arr[j]);
	                }
	            }
	        }
	    }
	public static void main(String[] args)
	    {
	      
	        FindingPair.Elements(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
	}
	}

