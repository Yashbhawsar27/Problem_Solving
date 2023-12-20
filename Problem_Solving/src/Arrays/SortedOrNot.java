package Arrays;

import java.util.Arrays;

public class SortedOrNot {

	public static boolean checkArraySorted(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
				
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		int arr[]= {22,33,25,3,232,523,55423};
		 Arrays.sort(arr);// sort kr dega
		System.out.println(checkArraySorted(arr));
	}
}
