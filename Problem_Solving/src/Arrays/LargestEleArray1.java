package Arrays;

import java.util.Arrays;

public class LargestEleArray1 {
	
	public static int largestElementofArray(int[] arr)
	{
		 Arrays.sort(arr);
		 return arr[arr.length-1];
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		int arr1[]= {1,2,4,67,211,2342,13,1};
		int arr2[]= {2,33,13,2,113,13222,23};
		
		System.out.println(largestElementofArray(arr1));
		System.out.println( largestElementofArray(arr2));
		
	// tc -- N*log(N)
	}

}
